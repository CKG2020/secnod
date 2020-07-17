package com;

import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;

public class MySqlsession {
    private Excutor1 executor=new MyExcutor();
   private MyConfiguration myConfiguration= new MyConfiguration();


    public <T> T selectone(String statement,Object parameter) {
        return executor.query(statement,parameter);

    }

    public <T> T getMapper(Class<T> tClass){
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(),new Class[]{tClass},new MyMapperProxy(this,myConfiguration));



    }

}
