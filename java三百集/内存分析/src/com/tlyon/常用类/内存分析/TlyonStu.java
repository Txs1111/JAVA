package com.tlyon.常用类.内存分析;


public class TlyonStu {

    //属性fields
    int  id;
    String  sname;
    int  age;

    Computer  comp;  //计算机

    //方法
    void  study(){
        System.out.println("我在认真学习！！,使用电脑："+comp.brand);
    }

    void  play(){
        System.out.println("我在玩游戏！王者农药！");
    }

    //构造方法。用于创建这个类的对象。无参的构造方法可以由系统自动创建。
    TlyonStu(){
        System.out.println("调用了无参的构造方法！");
    }

    //程序执行的入口，必须要有
    //javac  Tlyonstu.java   ,   java Tlyonstu
    public static void main(String[] args) {
        TlyonStu  stu = new TlyonStu();   //创建一个对象
        stu.id=1001;
        stu.sname= "高淇";
        stu.age = 18;

        Computer  c1 = new Computer();
        c1.brand = "联想";

        stu.comp = c1;

        stu.play();
        stu.study();

    }
}

class  Computer {
    String  brand;
}


