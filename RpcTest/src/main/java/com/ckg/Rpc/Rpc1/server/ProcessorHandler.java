package com.ckg.Rpc.Rpc1.server;

import java.net.Socket;

public class ProcessorHandler implements  Runnable {

   private Socket socket;
   private  Object service;

    public ProcessorHandler(Socket socket, Object service) {
        this.socket = socket;
        this.service = service;
    }

    public void run() {

    }


//    public  Object invoke(){
//
//    }



}
