package com.tlyon.常用类.String源码.直接赋值字符串与new关键字赋值;

public class TestString {
    public static void main(String[] args) {
    /**
     * 3. String str=”kvill”；
     *    String str=new String (“kvill”);的区别：
     *   在这里，我们不谈堆，也不谈栈，只先简单引入常量池这个简单的概念。
     *   常量池(constant pool)指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据。它包括了关于类、方法、接口等中的常量，也包括字符串常量。
     *   看例1：
     *   String s0=”kvill”;
     *   String s1=”kvill”;
     *   String s2=”kv” + “ill”;
     *   System.out.println( s0==s1 );
     *   System.out.println( s0==s2 );
     *   结果为：
     *   true
     *   true
     *   首先，我们要知结果为道Java会确保一个字符串常量只有一个拷贝。
     *   因为例子中的s0和s1中的”kvill”都是字符串常量，它们在编译期就被确定了，所以s0==s1为true；而”kv”和”ill”也都是字符串常量，当一个字符串由多个字符串常量连接而成时，它自己肯定也是字符串常量，所以s2也同样在编译期就被解析为一个字符串常量，所以s2也是常量池中”kvill”的一个引用。
     */
        String aa = "abc";
        String ab = "a" + "bc";

        String bb = ab.substring(1, 3);  //bc
        String bb2 = ab.substring(0, 1); //a
        System.out.println(bb2 + bb);   //abc
        System.out.println("ab==aa:" + (ab == aa));   //false
        System.out.println("ab==(bb2+bb):" + (ab == (bb2 + bb)));   //false

    }
}
