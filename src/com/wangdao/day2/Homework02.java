package com.wangdao.day2;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        String num1 = scanner.nextLine();
        System.out.print("请输入一个字符串: ");
        String num2 = scanner.nextLine();
        System.out.print("请输入一个小数: ");
        String num3 = scanner.nextLine();
        double value = Integer.parseInt(num1) + Double.parseDouble(num3);
        System.out.println("求和为: " + value);
        System.out.println("拼接字符串为: " + num1 + num2 + num3);
    }
}
