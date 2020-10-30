package com.ckg.gradleFirst.transanctionTest.service;


import com.ckg.gradleFirst.transanctionTest.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class OrdersService {
    // 注入Dao层对象
    @Autowired
    private OrdersDao ordersDao;




    // 注入TransactionTemplate对象
    @Autowired
    private TransactionTemplate transactionTemplate;


    // 调用dao的方法
    // 业务逻辑，写转账业务
    public void accountMoney() {
        transactionTemplate.execute(new TransactionCallback<Object>() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                Object result = null;
                try {
                    // 小马多1000
                    ordersDao.addMoney();
                    // 加入出现异常如下面int
//                     i=10/0    （银行中可能为突然停电等。。。）；结果：小马账户多了1000而小王账户没有少钱

                    // 解决办法是出现异常后进行事务回滚
                   // 事务管理配置后异常已经解决
                    // 小王 少1000
                    ordersDao.reduceMoney();
                } catch (Exception e) {
                    status.setRollbackOnly();
                    result = false;
                    System.out.println("Transfer Error!");
                }

                return result;
            }
        });

    }
}
