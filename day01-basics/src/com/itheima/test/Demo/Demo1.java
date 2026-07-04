package com.itheima.test.Demo;

public class Demo1 {
    static void main(String[] args) {
        String noodles = "陕西油泼面";
        switch(noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "牛肉面":
                System.out.println("吃牛肉面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
