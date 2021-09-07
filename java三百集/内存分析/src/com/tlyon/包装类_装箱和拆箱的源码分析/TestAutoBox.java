package com.tlyon.包装类_装箱和拆箱的源码分析;

/**
 * 测试自动装箱、自动拆箱
 *
 * @author Administrator
 */
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 234;   //自动装箱。Integer  a = Integer.valueOf(234);
        int b = a;                //自动拆箱。编译器会修改成：int  b = a.intValue();

        Integer c = null;
        if (c != null) {
            int d = c;            //自动拆箱：调用了：c.intValue()
        }


        //缓存[-128,127]之间的数字。实际就是系统初始的时候，创建了[-128,127]之间的一个缓存数组。
        //当我们调用valueOf()的时候，首先检查是否在[-128,127]之间，如果在这个范围则直接从缓存数组中拿出已经建好的对象
        //如果不在这个范围，则创建新的Integer对象。
        Integer in1 = Integer.valueOf(-128);
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为123在缓存范围内
        System.out.println(in1.equals(in2));//true
        System.out.println("################");
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true




        System.out.println("1111111111111111111111111111111111111111111111111");


        String s0 = "kvill";
        String s1 = new String("kvill");
        String s2 = new String("kvill");
        System.out.println(s0 == s1);
        System.out.println("**********");
        s1.intern();
        s2 = s2.intern(); //把常量池中"kvill"的引用赋给s2
        System.out.println(s0 == s1);
        System.out.println(s0 == s1.intern());
        System.out.println(s0 == s2);
    }
}
