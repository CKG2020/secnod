package com.easyArch.client.manager;

import com.easeArch.common.entry.User;

public class UserManager {
    private static UserManager instance=new UserManager();
    private User profile=new User();

    public static  UserManager getInstance(){
        return instance;
    }


//    public void updateMyProfile(User userInfo) {
//        profile.setSex(userInfo.getSex());
////        profile.setSignature(userInfo.getSignature());
//        profile.setUserId(userInfo.getUserId());
//        profile.setUserName(userInfo.getUserName());
//    }


}
