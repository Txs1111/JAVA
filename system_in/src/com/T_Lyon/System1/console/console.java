package com.T_Lyon.System1.console;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

/**
 * @author Lyon
 * 2021-5-22 16:01:43
 * 测试System下的console
 * <p>
 * 使用控制台读取输入（仅在IDE外部可用）：
 */
public class console {
    public static void main(String[] args) {
        // jdk 1.6
        Console console = System.console();

        System.out.print("Enter your name: ");
        String name = console.readLine();
        System.out.println("Name is: " + name);

        System.out.print("Enter your password: ");

        // Reads a password from the console with echoing disabled
        char[] password = console.readPassword();
        String passwordStr = String.valueOf(password);
        // char[] to String;
        System.out.println("Password is: " + passwordStr);

    }

}
