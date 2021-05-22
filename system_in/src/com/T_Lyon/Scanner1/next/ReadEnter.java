package com.T_Lyon.Scanner1.next;


import java.util.Scanner;


/**
 * @author Lyon
 * <p>
 * 2021-5-22 15:25:27
 * 测试next
 */
public class ReadEnter {
    /**
     * 以空格为界限，只读取第一个空格前的字符，后面的字符一律不读取
     */
    public static void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.next();
        pd(s);
    }

    /**
     * 限制输入的字符规则
     *
     * @param s
     */
    private static void pd(String s) {
        if (s.length() != 0) {
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
