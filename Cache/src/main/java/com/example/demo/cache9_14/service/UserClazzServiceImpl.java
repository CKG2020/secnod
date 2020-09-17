package com.example.demo.cache9_14.service;

import com.example.demo.cache9_14.dao.UserClazzRefDao;
import com.example.demo.cache9_14.entity.UserClazzRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClazzServiceImpl {


    @Autowired
    private UserClazzRefDao userClazzRefDao;


    public int userJoinInClazz(int userId, int clazzId) {
        return userClazzRefDao.insertUserClazzRef(new UserClazzRef(userId, clazzId));
    }


    public int changeUserClazz(int userId, int clazzId) {
        return userClazzRefDao.updateUserClazzRef(new UserClazzRef(userId, clazzId));
    }

    public UserClazzRef findByUserId(int userId) {
        return userClazzRefDao.findByUserId(userId);
    }

    @Cacheable(cacheNames = "ClazzUserIds", key = "#clazzId")
    public List<Integer> findUserIdByClazzId(int clazzId) {
        return userClazzRefDao.findByClazzId(clazzId);
    }

}
