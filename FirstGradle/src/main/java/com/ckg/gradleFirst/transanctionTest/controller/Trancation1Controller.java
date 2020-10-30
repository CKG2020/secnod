package com.ckg.gradleFirst.transanctionTest.controller;

import com.ckg.gradleFirst.transanctionTest.service.OrdersService;
import com.ckg.gradleFirst.transanctionTest.service.OrdersService1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trancation1Controller {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrdersService1 ordersService1;
   @GetMapping("/test1")
    public void testAdd1() {
        ordersService.accountMoney();
    }

    @GetMapping("/test2")
    public void testAdd2(){
       ordersService1.accountMoney();
    }




}
