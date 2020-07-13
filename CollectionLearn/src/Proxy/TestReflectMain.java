package Proxy;

import Proxy.com.JD.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectMain {
    public static void main(String[] args) {
        try {
            Class tt= Class.forName("Proxy.com.JD.Test");
            Method main = tt.getDeclaredMethod("main",
                    (new String[0]).getClass());
            String[] args1={};
            Object[] o={args1};
            main.invoke(null,o);

        }
        catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
