package com;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDirect {
    @Autowired
    private DirectSender directSender;
//    @Autowired
//    private  DirectReceiver directReceiver;


//    @Test
//    void directReceive(){
//        directReceiver.receiverMsg();
//    }



    @Test
    void directSend(){
        directSender.send(1);
    }
}
