package com;

/*
 * 抽奖类
 * 1.判断是否登录
 * 2.输入抽奖卡号
 * 有三次输入卡号的机会
 * 3.判断是否中奖
 */

import java.util.Scanner;

public class CJ {
    // 保存输入卡号的次数
    static int cardNumber = 0;
    // 抽奖方法
    public static void userCJ() {
        // 判断登录状态
        if (!User.isLogin) {
            // 没登录 直接结束方法
            System.out.println("请先登录");
            return;
        }
        // 判断是否输入正确
        if(!isCarNum()) {
            System.out.println("你输入的不正确");
            return;
        }

        // 匹配账号
        // 保存是否中奖的变量
        boolean isCJ = false;
        // 随机五个数并且拼接成字符串打印逗号隔开
        String string = "本日幸运数字:";
        for (int i = 0; i < 5; i++) {
            // 随机
            int num = (int)(Math.random() * 1001 + 1000);
            // 拼接
            if (i < 4) {
                string = string + num + ",";
            } else {
                string = string + num;
            }
            // 查看是否中奖
            if (num == User.cardNumber) {
                isCJ = true;
            }
        }
        // 打印中奖号
        System.out.println(string);
        // 判断是否中奖
        if(isCJ) {
            System.out.println("中奖");
        } else {
            System.out.println("没中奖");
        }
    }

    // 输入卡号方法
    public static boolean isCarNum() {
        System.out.println("请输入卡号:");
        Scanner scanner = new Scanner(System.in);
        // 接收
        String carNum = scanner.nextLine();
        // 转int
        int num = Integer.parseInt(carNum);
        // 进行比对
        if (User.cardNumber == num) {
            // 匹配正确
            System.out.println("卡号输入正确");
            return true;
        } else {
            //匹配不正确
            cardNumber++;
            System.out.println("输入还剩" + (3 - cardNumber) + "次");
            if (cardNumber != 3) {
                isCarNum();
            } else {
                System.out.println("3次机会用完");
                // 输入卡号次数重置
                cardNumber = 0;
            }
            return false;
        }
    }
}
