package com.example.javaanli.demo.service1;


import com.example.javaanli.demo.dao1.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl {


    @Autowired
    private GoodsMapper goodsMapperr;


    public   int findPrice( int productID){
        return goodsMapperr.findPrice(productID);
    }

    public  int  findQuantity(int productID){

        return goodsMapperr.findQuantity(productID);
    }

    public  int findMonry(int productID){

        return  goodsMapperr.findMoney(productID);
    }
}
