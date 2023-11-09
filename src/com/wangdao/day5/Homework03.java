package com.wangdao.day5;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        int result = convertNum(11);
        System.out.println(result);
    }

    public static int convertNum(int num){
        if (num == 1) {
            return 1;
        }
        return num % 2 + 10 * convertNum(num / 2);
    }
}
