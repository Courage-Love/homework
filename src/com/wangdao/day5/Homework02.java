package com.wangdao.day5;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        int max = maxNum(1, 5, 8, 5, 10, 52, 63, 3, 15);
        System.out.println(max);
    }

    public static int maxNum(int... nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
