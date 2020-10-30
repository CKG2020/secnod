package com.example.javaanli.demo.dao1.mapper;

import com.example.javaanli.demo.entity1.LogInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginfoDao extends MongoRepository<LogInfo, Integer> {
}
