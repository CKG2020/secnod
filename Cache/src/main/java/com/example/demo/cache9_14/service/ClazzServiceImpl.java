package com.example.demo.cache9_14.service;

import com.example.demo.cache9_14.dao.ClazzDao;
import com.example.demo.cache9_14.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ClazzServiceImpl {


    @Autowired
    private ClazzDao clazzDao;


    public int insertClazz(Clazz clazz) {
        return clazzDao.insertClazz(clazz);
    }

    @Cacheable(cacheNames = "clazz", key = "#clazzId")
    public Clazz findClazzById(int clazzId) {
        return clazzDao.findByUserId(clazzId);
    }
}
