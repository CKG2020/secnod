package com.ckg.gradleFirst.transanctionTest.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDao {
    // 注入jdbcTemplate模板对象
    @Autowired
    private JdbcTemplate jdbcTemplate;
    // 对数据操作的方法不包含业务操作
    /**
     * 小王少钱的方法
     */
    public void reduceMoney() {
        String sql = "update account set salary=salary-? where username=?";
        jdbcTemplate.update(sql, 1000, "小王");
    }

    /**
     * 小马多钱的方法
     */
    public void addMoney() {
        String sql = "update account set salary=salary+? where username=?";
        jdbcTemplate.update(sql, 1000, "小马");
    }
}
