package com.example.demo.cache9_14.service;


import com.example.demo.cache9_14.dao.UserClazzRefDao;
import com.example.demo.cache9_14.dao.UserDao;
import com.example.demo.cache9_14.entity.User;
import com.example.demo.cache9_14.entity.UserClazzRef;
import com.sun.xml.internal.bind.v2.TODO;
import org.omg.CORBA.TRANSACTION_MODE;
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
    //事务  就是 需要同时操作多个表格
//    TODO:TRANSACTION  类似备忘录  逻辑有错误 需要以后加上的东西   右面会有蓝色的小标
// FIXME  有bug要改
//    public int updateUserAndChangeUserClazz(User user, int clazzId, int oldClazzId) {
//        //TODO:TRANSACTION 同时成功和同时失败     下面必须在同一个连接里面操作
//        /*一个请求进来了  达到tomcat'里面了 对其进行解析   */
//        int updateUser = userDao.updateUser(user);
//        int updateUserClazzRef = userClazzRefDao.updateUserClazzRef(new UserClazzRef(user.getId(), clazzId));
//        return updateUser + updateUserClazzRef;
//    }

//事务    begin    rollback      commit之后才会提交到数据库

    public int updateUserAndChangeUserClazz(User user, int clazzId, int oldClazzId) {
        //TODO:TRANSACTION 同时成功和同时失败     下面必须在同一个连接里面操作
        /*一个请求进来了  达到tomcat'里面了 对其进行解析   */
        int updateUser = userDao.updateUser(user);
        int updateUserClazzRef = userClazzRefDao.updateUserClazzRef(new UserClazzRef(user.getId(), clazzId));
        return updateUser + updateUserClazzRef;
    }
}
