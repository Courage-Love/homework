package com.wangdao.day5;

import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 7};
        int[] nums2 = {3, 3, 4, 6, 8};
        int[] ints = combineArray(nums1, nums2);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] combineArray(int[] nums1, int[] nums2) {
        int[] ints = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            ints[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length ; i++) {
            ints[i + nums1.length] = nums2[i];
        }
        return ints;
    }
}
