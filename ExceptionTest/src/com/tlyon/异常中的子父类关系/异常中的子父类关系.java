package com.tlyon.异常中的子父类关系;

import org.junit.Test;

public class 异常中的子父类关系 {
    @Test
    public void testException() {
        try {
            String str = "lili";
            System.out.print(str + "年龄是：");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("子级异常");
            e.printStackTrace();
            e.getMessage();
            e.toString();
        } catch (Exception e) {
            System.out.println("父级异常");
            e.printStackTrace();
            e.getMessage();
            e.toString();
        } finally {

        }
    }

//    @Test
//    public void testException错误演示() {
//        try {
//            String str = "lili";
//            System.out.print(str + "年龄是：");
//            int age = Integer.parseInt("20L");
//            System.out.println(age);
//
//        } catch (Exception e) {
//            System.out.println("父级异常");
//            e.printStackTrace();
//            e.getMessage();
//            e.toString();
//
//        } catch (NumberFormatException e) {
//            System.out.println("子级异常");
//            e.printStackTrace();
//            e.getMessage();
//            e.toString();
//        } finally {
//        }
//    }
}
