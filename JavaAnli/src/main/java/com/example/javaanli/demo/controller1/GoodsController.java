package com.example.javaanli.demo.controller1;

import com.example.javaanli.demo.annotation.LogRecord;
import com.example.javaanli.demo.service1.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {

    @Autowired
    private GoodsServiceImpl   goodsService;

    @RequestMapping(value = "/price", method = RequestMethod.POST)
    @ResponseBody
    @LogRecord(operation = "查询商品价格", type = "收银员操作")

    public int addRecord(@RequestParam int productID)
     {
        System.out.println("xxxxx");

         int price = goodsService.findPrice(productID);
            return price;
    }



    @RequestMapping(value = "/quantity", method = RequestMethod.POST)
    @ResponseBody
    public int addRecord1(@RequestParam int productID)
    {
        System.out.println("xxxxx");

//        int price = goodsService.findPrice(productID);

        int quantity = goodsService.findQuantity(productID);

        return quantity;
    }



    @RequestMapping(value = "/money", method = RequestMethod.POST)
    @ResponseBody
    public int addRecord2(@RequestParam int productID)
    {
        System.out.println("xxxxx");

        int monry = goodsService.findMonry(productID);
        return  monry;
    }








}
