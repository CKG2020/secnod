package com;

/*
 * 抽奖开始类(组装抽奖逻辑)
 *
 */

import java.util.Scanner;

public class CJStart {
    // 抽奖开始
    public void cjStart() {
        // 是否继续主菜单
        String isGoOn = "";
        // 循环主菜单
        do {
            System.out.println("*****欢迎进入抽奖系统*****");
            System.out.println(" 1.注册");
            System.out.println(" 2.登录");
            System.out.println(" 3.抽奖");
            System.out.println("************************");
            Scanner scanner = new Scanner(System.in);
            // 接收菜单选项
            String menuNum = scanner.nextLine();
            // 判断选项
            chooseMenuNum(menuNum);
            // 接收是否继续
            System.out.println("是否继续选择? y/n");
            isGoOn = scanner.nextLine();
        } while (isGoOn.equals("y"));
    }

    // 判断菜单选项
    public void chooseMenuNum(String menuNum) {
        if ("1".equals(menuNum)) {
            System.out.println("[蓝欧抽奖系统 > 注册]");
            System.out.println("请填写个人注册信息:");
            // 调用注册方法
            Registry.userRegister();

        } else if ("2".equals(menuNum)) {
            System.out.println("[蓝欧抽奖系统 > 登录]");
            // 调用登录方法 保存登录状态
            boolean userLogin = Login.userLogin();
            User.isLogin = userLogin;

        } else if ("3".equals(menuNum)) {
            System.out.println("[蓝欧抽奖系统 > 抽奖]");
            // 调用抽奖方法
            CJ.userCJ();

        } else {
            System.out.println("输入错误,请重新选择");

        }
    }
}
