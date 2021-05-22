package com.T_Lyon.next;


import java.util.Scanner;

/**
 * @author Lyon
 * <p>
 * 2021年5月22日14:01:39
 * 测试nextLine
 */
public class ReadEnter {
    /**
     * 注意scanner必须使用主函数，@Test没有办法使用
     */
    public static void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.next();
        if (!s.equals(null)) {
            //且不为回车
            System.out.println("success");
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
