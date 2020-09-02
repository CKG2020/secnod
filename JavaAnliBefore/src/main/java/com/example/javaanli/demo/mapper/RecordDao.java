package com.example.javaanli.demo.mapper;

import com.example.javaanli.demo.Model.Record;
import com.github.pagehelper.Page;

import java.util.List;

public interface RecordDao {


    List<Record> findAll();//管理员查所有成员 简单分页

    List<Record> findUsersBySno(String sno);
    List<Record> findUsersByName(String name);

    List<Record> findUsersByClass(String sclass);






    int findSnoCount(String sno);

    int findallcount();
    int findAllFinished();
    int findAgeCount(int age);
    int findNameCount(String name);
    int findCollageCount(String collage);
    int findClassCount(String sclass);
    int findFriendsCount(String sno);



    int countBoardMsg(String sno);
    int countRequest(String sno);

    int historyMsgCount(String sno);
    int historyRequestCount(String sno);

    void close();
    void getSession();



}
