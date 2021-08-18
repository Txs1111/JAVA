package com.tlyon.异常的常用方法;

import org.junit.Test;

public class 异常的常用方法 {
    @Test
    public void testException(){
        try {
            String str ="lili";
            System.out.print(str+"年龄是：");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }catch (Exception e){
            System.out.println(new 异常的常用方法().getClass().getName());
            e.printStackTrace();
            e.getMessage();
            e.toString();
        }finally{

        }


    }
}
