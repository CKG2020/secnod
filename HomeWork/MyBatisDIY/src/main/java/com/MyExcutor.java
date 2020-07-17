package com;

import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Excutor1;

public class MyExcutor implements Excutor1 {
    private  MyConfiguration xmlConfiguration=new MyConfiguration();

    public <T> T query(String sql,Object parameter){

        Connection connection = getConnection();
        ResultSet set=null;
        PreparedStatement pre=null;
        try{
            pre=connection.prepareStatement(sql);
            pre.setString(1,parameter.toString());
           set= pre.executeQuery();

           User u=new User();
           while (set.next()){
//               u.setId(set.getString(1));
//               u.setUsername(set.getString(2));
//               u.setPassword(set.getString(3));
               u.setSid(set.getInt(1));
               u.setSname(set.getString(2));
               u.setSsex(set.getString(3));
               u.getSdept(set.getString(4));

           }
           return (T) u;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if (set!=null){
                    set.close();
                }
                if(pre!=null){
                    pre.close();
                }
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

   return null;

    }

    private Connection getConnection() {
        try{
            Connection connection=xmlConfiguration.build("DbConfig.xml");
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
