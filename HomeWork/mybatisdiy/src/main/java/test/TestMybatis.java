package test;


import SqlExplain.MySqlsession;
import Users_in_using.UserMapper;
import bean.User;

public class TestMybatis {
    public static void main(String[] args) {

        MySqlsession mySqlsession = new MySqlsession();
        UserMapper mapper = mySqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }
}
