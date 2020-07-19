package com.Verfiy;

import java.util.HashMap;

public class Split {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        String string="Card.a.cid=1";
        String[] split = string.split("=");
        hashMap.put(split[0],split[1]);

        System.out.println(hashMap.get(split[0]));

    }
}
