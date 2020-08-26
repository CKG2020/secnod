package com.example.javaanli.demo.service1;


import com.example.javaanli.demo.dao1.mapper.CasherMapper;
import com.example.javaanli.demo.entity1.Casher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasherServiceImpl {
    @Autowired
    private CasherMapper casherMapper;

    public Casher findUserByNameAndPassword(String username, String password) {
        return casherMapper.findByNumAndPassword(username, password);
    }


}
