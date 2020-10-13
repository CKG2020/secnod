package com;

/*
 * 登录类
 * 1.输入登录的账号和密码
 * 2.和用户信息 进行匹配
 * 有三次重新输入的机会
 * 3.登录成功
 */

import java.util.Scanner;

public class Login {
    // 保存登录失败的次数
    static int num = 0;
    // 登录方法
    // 静态方法里面 需要使用静态的成员变量
    public static boolean userLogin() {
        // 先判断是否注册
        if (User.isRegister == false) {
            System.out.println("请先注册");
            Registry.userRegister();
            // 登录失败
            return false;
        }
        // 输入信息
        System.out.println("用户名:");
        Scanner scanner = new Scanner(System.in);
        // 接收信息
        String userName = scanner.nextLine();
        System.out.println("密码:");
        String passWord = scanner.nextLine();
        // 判断匹配登录信息
        if(userName.equals(User.userName) && passWord.equals(User.passWord)) {
            // 登录成功
            System.out.println("欢迎您" + userName);
            // 返回登录结果
            return true;
        } else {
            // 登录失败
            num++;
            // 提示用户还剩几次机会
            System.out.println("用户名或密码有误,请重新输入!" + "还剩" + (3 - num) + "次");
            // 判断登录错了几次
            if (num != 3) {
                // 继续登录
                userLogin();
            } else {
                // 登录失败
                System.out.println("对不起三次机会用完,请明日再来!");
                // 重置记录登录次数的变量
                num = 0;
            }
            // 如果代码走到这里 一定是登录失败
            return false;
        }
    }
}
