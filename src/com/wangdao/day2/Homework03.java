package com.wangdao.day2;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.print("请输入您的用户名: ");
            String userId = scanner.nextLine();
            System.out.print("请输入您的密码: ");
            String password = scanner.nextLine();
            if (userId.equals("admin") && password.equals("123456")){
                System.out.println("登录成功");
                return;
            }
            System.out.println("登录失败，还剩 " + (i-1) + " 次机会");
        }
        System.out.println("您的账户已锁定!");
    }
}
