package com.ckg.gradleFirst.transanctionTest.service;


import com.ckg.gradleFirst.transanctionTest.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false, timeout = -1)
public class OrdersService1 {
    @Autowired
    private OrdersDao ordersDao;

    // 调用dao的方法
    // 业务逻辑，写转账业务
    public void accountMoney() {
        // 小马多1000
        ordersDao.addMoney();
        // 加入出现异常如下面int i=10/0（银行中可能为突然停电等。。。）；结果：小马账户多了1000而小王账户没有少钱
        // 解决办法是出现异常后进行事务回滚
         int i = 10 / 0;// 事务管理配置后异常已经解决
        // 小王 少1000
        ordersDao.reduceMoney();
    }
}