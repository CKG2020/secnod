package com.easyArch.client.netty;

//import com.cxl.rpc.remoting.consumer.reference.RpcReferenceBean;

import com.easeArch.common.entry.User;
import com.easeArch.common.netty.INettyClient;
import com.easeArch.common.service.API;

public class TrayClient implements INettyClient {
//    private static final Object API = ;
    private String address;
//    private RpcReferenceBean rpcReferenceBean=new RpcReferenceBean();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void connect() {
//        rpcReferenceBean.init();
    }



    @Override
    public API handler() {

        API api = new API() {
            @Override
            public Object login(User user) {
                return "1";
            }

            @Override
            public Object registry(User user) {
                return null;
            }
        };
//        rpcReferenceBean.setAddress(address);
//        rpcReferenceBean.setIface(API.class);
//        API object = (API) rpcReferenceBean.getObject();
//        return object;
        return api;
    }

    @Override
    public int isOn() {



        return 0;
    }

    @Override
    public int isOff() {
        return 0;
    }


}
