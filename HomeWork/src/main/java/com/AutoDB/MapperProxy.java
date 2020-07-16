package com.AutoDB;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MapperProxy implements InvocationHandler {

   @SuppressWarnings("unchecked")
   public <T> T newInstance (Class<T> clz){
       return (T) Proxy.newProxyInstance(clz.getClassLoader(),new Class[]{clz},this);
   }

       @Override
       public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
   if (Object.class.equals(method.getDeclaringClass())){
       try{
           return method.invoke(this,args);
       }
       catch (Throwable a){

       }
   }
       return new User((Integer) args[0],"zhangsan",18);



    }
}
