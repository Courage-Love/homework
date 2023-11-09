package com.wangdao.day3;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class StudentManagementSystem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------王道Java学生管理系统-----------------");
            System.out.print("\n\t\t\t\t\t1.学 生 列 表");
            System.out.print("\n\t\t\t\t\t2.增 加 学 生");
            System.out.print("\n\t\t\t\t\t3.删 除 学 生");
            System.out.print("\n\t\t\t\t\t4.修 改 学 生");
            System.out.print("\n\t\t\t\t\t5.查 询 学 生");
            System.out.print("\n\t\t\t\t\t6.退 出 系 统\n");
            System.out.print("请选择功能(1-6): ");
            int num = scanner.nextInt();
            if (num == 6) {
                System.out.print("确认退出吗(1/2): ");
                if (scanner.nextInt() == 1){
                    System.out.println("感谢使用本系统！");
                    break;
                }
            }
        }
    }
}
