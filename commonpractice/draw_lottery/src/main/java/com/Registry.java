package com;

/*
 * 注册类
 * 1.输入账号 密码
 * 2.产生随机号 [1000,2000]
 * 3.保存用户注册信息
 * 4.提示注册成功
 */

import java.util.Scanner;

public class Registry {
    // 注册方法
    public static void userRegister() {
        System.out.println("请输入用户名:");
        Scanner scanner = new Scanner(System.in);
        // 接收用户信息
        String userName = scanner.nextLine();
        System.out.println("请输入密码:");
        String passWord = scanner.nextLine();
        int num = (int)(Math.random() * 1001 + 1000);
        // 保存到用户类中
        User.userName = userName;
        User.passWord = passWord;
        User.cardNumber = num;
        // 打印注册信息
        System.out.println();
        System.out.println("注册成功,请记好你的会员卡号");
        System.out.println("用户名:" + userName);
        System.out.println("密码:" + passWord);
        System.out.println("卡号:" + num);

        // 保存注册状态
        User.isRegister = true;
    }
}
