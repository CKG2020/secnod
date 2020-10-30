package org;

import org.IT;

import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String[] args) {

     String classname=args[0];
     String path=args[1];

        try {
            URL[] urls={new URL("file://"+path)};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class t = urlClassLoader.loadClass(classname);
            IT tt = (IT)t.newInstance();
            System.out.println(tt.xxx(1,2));


        } catch (Exception e) {
            System.out.println("have nothing");
        }


    }


}
