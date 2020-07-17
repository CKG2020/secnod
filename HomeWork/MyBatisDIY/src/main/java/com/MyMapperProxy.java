package com;

import com.mapper.Function1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class MyMapperProxy implements InvocationHandler {
    private MySqlsession mySqlsession;
    private  MyConfiguration myConfiguration;

    public MyMapperProxy(MySqlsession mySqlsession, MyConfiguration myConfiguration) {
        this.mySqlsession = mySqlsession;
        this.myConfiguration = myConfiguration;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MapperBean mapperBean = myConfiguration.readMapper("UserMapper.xml");
        if (!method.getDeclaringClass().getName().equals(mapperBean.getInterfaceName())){
            return  null;
        }
        List<Function1> list = mapperBean.getList();
        if (null!=list||0!=list.size()){
            for (Function1 function1:list){
                if (method.getName().equals(function1.getFuncName())){
                    return mySqlsession.selectone(function1.getSql(),String.valueOf(args[0]));
                }
            }
        }


        return null;
    }
}
