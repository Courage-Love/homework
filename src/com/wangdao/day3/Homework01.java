package com.wangdao.day3;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        //第一问
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        //第二问
        System.out.print("请输入行数: ");
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //第三问
        System.out.print("请输入一个正整数: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        //第四问
        System.out.print("请输入一个整数: ");
        int num1 = scanner.nextInt();
        System.out.println(num1 % 2 == 0 ? "该数是偶数" : "该数是奇数");

        //第五问
        System.out.print("请输入行数：");
        int num2 = scanner.nextInt();
        System.out.print("请输入列数：");
        int num3 = scanner.nextInt();
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num3; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }

        //第六问
        System.out.print("请输入一个整数：");
        int num4 = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= num4; i++) {
            boolean loop = true;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != 1 && j != i){
                    loop = false;
                    break;
                }
            }
            if (loop){
                count++;
            }
        }
        System.out.println(num4 + "以内的素数有 " + count + " 个");
    }
}
