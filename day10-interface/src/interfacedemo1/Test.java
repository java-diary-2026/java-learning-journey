package interfacedemo1;

public class Test {
    static void main(String[] args) {

        Frog f = new Frog("小白",1);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        Dog d = new Dog("小黑",2);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();
    }
}
