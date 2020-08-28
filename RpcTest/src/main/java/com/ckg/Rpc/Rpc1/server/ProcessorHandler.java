package com.ckg.Rpc.Rpc1.server;

import com.ckg.Rpc.Rpc1.client.RpcRequest;
import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

public class ProcessorHandler implements  Runnable {

   private Socket socket;
   private  Object service;

    public ProcessorHandler(Socket socket, Object service) {
        this.socket = socket;
        this.service = service;
    }

    public void run() {
        ObjectInputStream inputStream=null;
        try{
            inputStream = new ObjectInputStream(socket.getInputStream());
            RpcRequest request =(RpcRequest) inputStream.readObject();
            Object  result = invoke(request);


            ObjectOutputStream outputStream= new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(result);
            outputStream.flush();
            inputStream.close();
            outputStream.close();



        }catch(Exception e){

            e.printStackTrace();
        }
        finally {
            if (inputStream!=null){
                try{
                    inputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }


        }

    }


    public  Object invoke(RpcRequest request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] args = request.getParameters();
        Class<?>[] types= new Class[args.length];

        for (int i = 0; i <args.length ; i++) {
            types[i] = args[i].getClass();
        }

        Method method = service.getClass().getMethod(request.getMethodName(), types);

        return method.invoke(service,args);



    }



}
