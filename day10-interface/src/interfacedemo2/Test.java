package interfacedemo2;

public class Test {
    static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("张三",21);
        System.out.println(pps.getName() + "," + pps.getAge());
        pps.speak();
        pps.study();
    }
}
