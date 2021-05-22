package com.T_Lyon.读取与输出.Scanner1.hasNextDouble;


import java.util.Scanner;


/**
 * @author Lyon
 * <p>
 * 2021-5-22 15:54:50
 * 测试hasNextDouble
 */
public class ReadEnter {
    /**
     * 读取输入的单词，判断是否有Double型数（读取Double，Int等整形类型的数中间有其他类型的数就会结束读取），以空格为界限，常搭配next使用
     */
    public static void demo() {
        System.out.println("请输入若干单词，以空格作为分隔");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextDouble()) {
            System.out.println("键盘输入的内容是：" + sc.next());
        }
//        pd(s);
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
