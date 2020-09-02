package com.example.javaanli.demo.mapper;

import com.example.javaanli.demo.Model.Record;
import com.example.javaanli.demo.util.Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class RecordDaoImpl implements RecordDao{

    public static SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession=sqlSessionFactory.openSession();


    @Override
    public List<Record> findAll() {
        return sqlSession.selectList("RecordMapper.findAll");
    }

    @Override
    public List<Record> findUsersBySno(String Sno) {
        return sqlSession.selectList("RecordMapper.findBySno",Sno);
    }

    @Override
    public List<Record> findUsersByName(String name) {
        return sqlSession.selectList("RecordMapper.findByName",name);
    }


    @Override
    public List<Record> findUsersByClass(String sclass) {
        return sqlSession.selectList("RecordMapper.findByClass",sclass);
    }

//    @Override
//    public String findUserNameBySno(String sno) {
//        return sqlSession.selectOne("UserMapper.findUserNameBySno",sno);
//    }
//
//
//    @Override
//    public User login(String Sno, String pwd) {
//        return sqlSession.selectOne("UserMapper.selectUser",Sno);
//    }
//
//    @Override
//    public Admin adminlogin(String username, String pwd) {
//        return sqlSession.selectOne("UserMapper.selectAdmin",username);
//    }
//    @Override
//    public boolean updateUser(User user) {
//        sqlSession.update("UserMapper.updateUser",user);
//        sqlSession.update("UserMapper.updateBirth",user);
//        sqlSession.commit();
//        return true;
//    }
    @Override
    public int findSnoCount(String sno) {
        return sqlSession.selectOne("UserMapper.findSnoCount",sno);
    }

    @Override
    public int findallcount(){
        return sqlSession.selectOne("UserMapper.findallcount");
    }

    @Override
    public int findAllFinished(){
        return sqlSession.selectOne("UserBoard.allFinished");
    }

    @Override
    public int findAgeCount(int age){
        return sqlSession.selectOne("UserMapper.findAgeCount",age);
    }

    @Override
    public int findNameCount(String name) {
        return sqlSession.selectOne("UserMapper.findNameCount",name);
    }

    @Override
    public int findCollageCount(String collage) {
        return sqlSession.selectOne("UserMapper.findCollageCount",collage);
    }

    @Override
    public int findClassCount(String sclass) {
        return sqlSession.selectOne("UserMapper.findClassCount",sclass);
    }

    @Override
    public int findFriendsCount(String sno) {
        return sqlSession.selectOne("UserBoard.countFriends",sno);
    }

//    @Override
//    public UserBoard setScores(String sno,int scores) {
//        UserBoard userBoard = new UserBoard();
//        userBoard.setSno(sno);
//        userBoard.setIsFinishedQuestion(true);
//        userBoard.setScores(scores);
//        sqlSession.update("updateFinishedQuestion",userBoard);
//        sqlSession.commit();
//        return userBoard;
//    }
//    @Override
//    public int searchScore(String sno){
//        return sqlSession.selectOne("UserBoard.searchScore",sno);
//    }
//
//    @Override
//    public boolean isFinished(String sno) {
//        if(sqlSession.selectOne("UserBoard.isFinished", sno)==null){
//            return false;
//        }
//        return sqlSession.selectOne("UserBoard.isFinished", sno);
//    }
//
//    @Override
//    public List<BoardMsg> showBoardMsg(String sno) {
//        return sqlSession.selectList("UserBoard.showBoardMsg",sno);
//    }
//
//    @Override
//    public User findUserBySno(String sno) {
//        return sqlSession.selectOne("UserMapper.findUserBySno",sno);
//    }
//    //实现对数据库操作的接口中的方法
//
//    @Override
//    public List<Integer> findScore(){
//        return sqlSession.selectList("UserBoard.findScore");
//    }
//
//    @Override
//    public boolean insertBoardMsg(BoardMsg msg) {
//        sqlSession.insert("UserBoard.insertBoardMsg",msg);
//        sqlSession.commit();
//        return true;
//    }

    @Override
    public int countBoardMsg(String sno) {
        return sqlSession.selectOne("UserBoard.boardMsgCount",sno);
    }

    @Override
    public int historyMsgCount(String sno) {
        return sqlSession.selectOne("UserBoard.historyMsgCount",sno);
    }

    @Override
    public int historyRequestCount(String sno) {
        return sqlSession.selectOne("UserBoard.historyRequestCount",sno);
    }

//    @Override
//    public int setHistoryMsgCount(Tips tips) {
//        System.out.println(tips);
//        sqlSession.update("UserBoard.setHistoryMsgCount", tips);
//        sqlSession.commit();
//        return 0;
//    }
//
//    @Override
//    public int setHistoryRequestCount(Tips tips) {
//        sqlSession.update("UserBoard.setHistoryRequestCount", tips);
//        sqlSession.commit();
//        return 0;
//    }
//
//    @Override
//    public boolean addRequest(FriendRequest request) {
//        sqlSession.insert("UserBoard.addFriendRequest",request);
//        sqlSession.commit();
//        return true;
//    }
//
//    @Override
//    public boolean acceptRequest(FriendRequest request) {
//        sqlSession.update("UserBoard.acceptAdd",request);
//        sqlSession.insert("UserBoard.addFriend",request);
//        sqlSession.commit();
//        return true;
//    }
//
//    @Override
//    public boolean refuseRequest(FriendRequest request) {
//        sqlSession.delete("UserBoard.refuseAdd",request);
//        sqlSession.commit();
//        return true;
//    }

    @Override
    public int countRequest(String sno) {
        return sqlSession.selectOne("UserBoard.countRequest",sno);
    }

    @Override
    public void close() {
        sqlSession.close();
    }

    @Override
    public void getSession() {

    }


//    @Override
//    public List<UserBoard> findUserBoard(String sno) {
//        return sqlSession.selectOne("UserBoard.findUserBoard",sno);
//    }
}
