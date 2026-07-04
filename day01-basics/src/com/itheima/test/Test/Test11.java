package com.itheima.test.Test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if(guessNumber>number){
                System.out.println("大了");
            }else if(guessNumber<number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }


    }
}
