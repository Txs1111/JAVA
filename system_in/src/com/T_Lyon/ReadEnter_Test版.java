package com.T_Lyon;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Lyon
 * <p>
 * 2021-5-22 14:53:53
 * <p>
 * 测试nextLine
 */
public class ReadEnter_Test版 {
    /**
     * 注意scanner必须使用主函数，@Test没有办法使用
     * <p>
     * 查阅得，这是IDEA的锅，
     * <p>
     * 在Help里面自定义vm选项中加入下面的即可
     * <p>
     * -Deditable.java.test.console=true
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.nextLine();
        if (!s.equals(null)) {
            //且不为回车
            System.out.println("success");
        }
    }


    /**
     * main1
     */
    @Test
    public void main1() {
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
    private int scanner_parameter() {
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
