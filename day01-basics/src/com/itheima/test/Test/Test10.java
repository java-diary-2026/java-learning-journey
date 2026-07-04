package com.itheima.test.Test;

import java.util.Random;

public class Test10 {
    static void main(String[] args) {
        Random r = new Random();

        for(int i=0;i<=100;i++){
            int number = r.nextInt(100);
            System.out.println(number);
        }
    }
}
