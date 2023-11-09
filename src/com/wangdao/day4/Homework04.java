package com.wangdao.day4;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
//        String[] str = {"1", "5", "8", "45", "9"};
//        System.out.println(str.length);
//        printArray01(str);
//        printArray02(str);
//        long l = Runtime.getRuntime().maxMemory();
//        System.out.println(l / 1024 / 1024);
//        int[] arr = {1, 2, 3, 4};
//        printArray03(arr);
        System.out.println(faibonacci(5));;

    }

    public static void printArray01(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static void printArray02(String[] str){
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void printArray03(int... nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int faibonacci(int n) {
        // 递归出口
        if (n == 2) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return faibonacci(n - 2) + faibonacci(n - 1);
    }
}
