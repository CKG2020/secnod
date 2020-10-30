package com.example.demo.cache9_14;

public class Test {
    static int i;
    public static void main(String[] args) {
//        int x,y,m,n;
//        for ( x = 0; x <=20 ; x++) {
//            for ( y = 0; y <=10 ; y++) {
//                for ( m = 0;m <=5; m++) {
//                    for (n=0;n<=2;n++){
//
//                        if(5*x+10*y+20*m+50*n==100){
//                            i++;
//                            System.out.printf("第%d的组合为 5元 %d ,10元 %d, 20元 %d,50元　%d",i,x,y,m,n);
//                            System.out.println();
//                        }
//
//
//
//
//                    }
//
//                }
//
//            }
//
//        }
//        System.out.println(i);

        int money[]={5,10,20,50};

        int dp[] = new int[100+1];
        dp[0] = 1;
        for(int i = 0;i < 4;++i){
            for(int j = money[i];j <= 100;++j){
                dp[j] =(dp[j]+dp[j-money[i]]);
            }
        }
        System.out.println(dp[100]);



    }

}
