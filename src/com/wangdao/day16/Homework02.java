package com.wangdao.day16;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数: ");
            String str = scanner.next();
            try {
                int i = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是整数，请重新输入~~");
            }
        }
        System.out.println("输入正确~~~");
    }
}

