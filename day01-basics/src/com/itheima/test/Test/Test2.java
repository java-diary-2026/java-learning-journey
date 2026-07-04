package com.itheima.test.Test;

public class Test2 {
    static void main(String[] args) {
        //1.&平且
        //两边都为真,结果才是真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(true & false);


        //2. | 或者
        //两边都为假,结果才是假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true | false);
    }
}
