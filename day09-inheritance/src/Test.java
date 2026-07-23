public class Test {
    static void main(String[] args) {

        Lecturer l = new Lecturer("001", "张三");
        System.out.println(l.getId() + l.getName() );
        //l.id();
        l.work();

        Tutor t = new Tutor("002", "李四");
        System.out.println(t.getId() + t.getName() );
        t.work();

        Maintainer m = new Maintainer("003", "王五");
        System.out.println(m.getId() + m.getName() );
        m.work();

        Buyer b = new Buyer("004", "赵六");
        System.out.println(b.getId() + b.getName() );
        b.work();
    }
}
