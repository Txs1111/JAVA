package com.T_Lyon.文件输出与输出;

/**
 * @author Lyon
 * 2021-5-22 16:51:33
 * 测试文件输出与输出
 */
public class demo {

    public static void main(String[] args) {
        //获取虚拟机启动目录的位置，重点System.getProperty()
        String property = System.getProperty("user.dir");
        System.out.println(property);
    }
}
