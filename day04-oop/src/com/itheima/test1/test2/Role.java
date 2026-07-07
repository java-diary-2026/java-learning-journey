package com.itheima.test1.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的

    String[] boyfaces = {"风流倜傥", "气宇轩昂", "五官端正", "相貌平平", "惨不忍睹"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "面目狰狞"};

    String[] attacks_dosc = {
            "%s使出了一招泰山陨石坠,再转到对方的身后,一脚向%s的头上踩去",
            "%s运气于掌,一瞬间掌心变得血红,一式掌心雷,推向%s"
    };

    String[] injureds_dosc = {
            "结果%s造成了一处瘀伤",
            "结果一击命中,%s痛得弯下腰"
    };


    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        //长相是随机的
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
            //从boyfaces里面随机长相
        } else if (gender == '女') {
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "满目狰狞";
        }


        this.face = face;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_dosc.length);
        String KungFu = attacks_dosc[index];
        //输出一个攻击的效果
        System.out.printf(KungFu, this.getName(), role.getName());
        System.out.println();

        //计算造成的伤害1~20
        int hurt = r.nextInt(20) + 1;

        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个验证,如果为负数了,就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        //受伤的描述
        if (remainBlood > 60) {
            System.out.printf(injureds_dosc[0], role.getName());
        } else {
            System.out.printf(injureds_dosc[1], role.getName());
        }
        System.out.println();
    }


    public void showRoleInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getGender());
        System.out.println("长相为:" + getFace());
    }
}
