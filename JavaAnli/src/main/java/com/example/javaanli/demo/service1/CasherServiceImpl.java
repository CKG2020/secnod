package com.example.javaanli.demo.service1;


import com.example.javaanli.demo.dao1.mapper.CasherMapper;
import com.example.javaanli.demo.entity1.Casher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CasherServiceImpl {
    @Autowired
    private CasherMapper casherMapper;

    @Cacheable(cacheNames = "login", key = "#username")
    public Casher findUserByNameAndPassword(String username, String password) {
        System.out.println("写入日志");
        return casherMapper.findByNumAndPassword(username, password);
    }


}
