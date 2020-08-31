package com.ckg.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask {
    public static void main(String[] args) {
//第一种情况
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Run timerTask:" + new Date());
            }
        };

        Timer timer = new Timer();
        //延迟一秒执行  每3秒执行一次
        timer.schedule(timerTask, 1000, 3000);

//        Run timerTask:Sat Aug 29 15:30:40 CST 2020
//        Run timerTask:Sat Aug 29 15:30:43 CST 2020
//        Run timerTask:Sat Aug 29 15:30:46 CST 2020
//        Run timerTask:Sat Aug 29 15:30:49 CST 2020
//        Run timerTask:Sat Aug 29 15:30:52 CST 2020
// 缺点一
        TimerTask timerTask1 = new TimerTask() {

            @Override
            public void run() {
                System.out.println("");

            }
        };


    }
}