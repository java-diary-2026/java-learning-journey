package com.itheima.test.Test;

import java.util.Scanner;

public class Test7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int money = sc.nextInt();
        int total = 600;
        if(money >= total){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
    }
}
