import java.util.ArrayList;

public class Test6 {
    static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "1234qwer");

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查看id是否存在
        boolean flag = contains(list, "001");

        //5.打印结果
        System.out.println(flag);


    }


    //1.我要干嘛?       根据id查找用户
    //2.我干这件事需要什么才能完成?      list    id
    //3.调用处是否需要使用方法的结果? 返回
    public static boolean contains(ArrayList<User> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                //如果找到了直接返回true
                return true;
            }
        }*/
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
