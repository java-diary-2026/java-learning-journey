package test;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的日期");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month<= 12)) {
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("键盘录入的月份不存在");
        }
        System.out.println(ticket);

    }

    public static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
