package com.T_Lyon.读取与输出.Scanner1.nextLine;


import java.util.Scanner;

/**
 * @author Lyon
 * <p>
 * 2021-5-22 15:12:00
 * 测试nextLine
 */
public class ReadEnter {
    /**
     * 以行为界限，读取回车前输入的所有字符
     * <p>
     * 注意scanner必须使用主函数，@Test没有办法使用
     */
    public static void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.nextLine();
        pd(s);
    }

    /**
     * 限制输入的字符规则
     *
     * @param s
     */
    private static void pd(String s) {
        if (s.length() != 0) {
            System.out.println("你输入的是：" + s);
            System.out.println("success");
        } else if (s.length() == 0) {
            System.err.println("输入内容不能为空");
        }
    }


    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        do {
            demo();
            System.out.println("是否继续---1.继续");
            System.out.println("----------其他结束");
        } while (scanner_parameter() == 1);
    }

    /**
     * 程序是否继续运行，判断规则
     *
     * @return
     */
    private static int scanner_parameter() {
        Scanner scanner = new Scanner(System.in);
        Object s = scanner.nextLine();
        if (s.equals("1")) {
            System.out.println("继续");
            return 1;
        } else {
            System.out.println("over！");
            return 0;
        }
    }

}
