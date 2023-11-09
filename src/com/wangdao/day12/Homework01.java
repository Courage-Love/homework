package com.wangdao.day12;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        // 手写实现类
//        IComputeImpl iCompute = new IComputeImpl();
//        System.out.println("两数之和为 " + iCompute.m1());

        // 手写局部内部类
//        class IComputeImpl2 implements ICompute {
//            @Override
//            public int m1() {
//                System.out.println("请输入两个数字");
//                Scanner scanner = new Scanner(System.in);
//                int num1 = scanner.nextInt();
//                int num2 = scanner.nextInt();
//                return num1 + num2;
//            }
//        }
//        IComputeImpl2 iComputeImpl2 = new IComputeImpl2();
//        System.out.println("两数之和为 " + iComputeImpl2.m1());

        // 匿名内部类
//        ICompute ic = new ICompute() {
//
//            @Override
//            public int m1() {
//                System.out.println("请输入两个数字");
//                Scanner scanner = new Scanner(System.in);
//                int num1 = scanner.nextInt();
//                int num2 = scanner.nextInt();
//                return num1 + num2;
//            }
//        };
//        System.out.println("两数之和为 " + ic.m1());

//        ICompute icp = () -> {
//            System.out.println("请输入两个数字");
//            Scanner scanner = new Scanner(System.in);
//            int num1 = scanner.nextInt();
//            int num2 = scanner.nextInt();
//            return num1 + num2;
//        };
//        System.out.println("两数之和为 " + icp.m1());
        int i = ((ICompute) () -> {
            System.out.println("请输入两个数字");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            return num1 + num2;
        }).m1();
        System.out.println("两数之和为 " + i);
    }
}

interface ICompute {
    int m1();
}

class IComputeImpl implements ICompute{

    @Override
    public int m1() {
        System.out.println("请输入两个数字");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }
}
