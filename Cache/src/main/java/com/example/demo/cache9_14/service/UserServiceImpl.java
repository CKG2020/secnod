package com.example.demo.cache9_14.service;


import com.example.demo.cache9_14.dao.UserClazzRefDao;
import com.example.demo.cache9_14.dao.UserDao;
import com.example.demo.cache9_14.entity.User;
import com.example.demo.cache9_14.entity.UserClazzRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
//@CacheConfig(cacheNames = "user")
public class UserServiceImpl {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserClazzRefDao userClazzRefDao;


    public User findUserByName(String username) {
        return userDao.findByName(username);
    }

    public User findUserByNameAndPassword(String username, String password) {
        return userDao.findByNameAndPassword(username, password);
    }

    public boolean register(User user) {
        //用户重名校验
        User userByName = findUserByName(user.getName());
        if (userByName != null && userByName.getName() != null && userByName.getName().equals(user.getName())) {
            return true;
        }
        //对用户密码进行MD5,目的是，数据库中的敏感数据，不要存储明文。
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        return userDao.insertUser(user) != 0;
    }

    @Cacheable(cacheNames = "user", key = "#id")
    public User findById(int id) {
        return userDao.findByUserId(id);
    }

    //CachePut会无条件的将方法的返回值写入指定的key中
//    @CachePut(cacheNames = "user", key = "#user.id")
    //CacheEvict按指定的key,清除缓存
    @CacheEvict(cacheNames = "user", key = "#user.id")
    public int updateUserName(User user) {
        return userDao.updateUser(user);
    }

    @Caching(evict = {@CacheEvict(cacheNames = "user", key = "#user.id"),
            @CacheEvict(cacheNames = "ClazzUserIds", key = "#oldClazzId")})
    public int updateUserAndChangeUserClazz(User user, int clazzId, int oldClazzId) {
        //TODO:TRANSACTION
        int updateUser = userDao.updateUser(user);
        int updateUserClazzRef = userClazzRefDao.updateUserClazzRef(new UserClazzRef(user.getId(), clazzId));
        return updateUser + updateUserClazzRef;
    }
}
