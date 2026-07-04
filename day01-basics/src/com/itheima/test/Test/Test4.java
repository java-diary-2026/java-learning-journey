package com.itheima.test.Test;

public class Test4 {
    static void main(String[] args) {
        int height1 = 165;
        int height2 = 210;
        int height3 = 180;
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
