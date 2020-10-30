package SqlExplain;

import Dao.MyConfiguration;

import java.lang.reflect.Proxy;

public class MySqlsession {
    private Excutors executor=new MyExcutor();
    private MyConfiguration myConfiguration= new MyConfiguration();


    public <T> T selectone(String statement,Object parameter) {
        return executor.query(statement,parameter);

    }

    public <T> T getMapper(Class<T> tClass){
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(),new Class[]{tClass},new MyMapperProxy(this,myConfiguration));

    }

}
