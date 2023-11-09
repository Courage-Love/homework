package com.wangdao.day5;

import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework05 {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "麻子"};
        System.out.println("初始的数组是:" + Arrays.toString(names));
        if (deleteName(names, "张三")) {
            System.out.println("删除成功!");
            System.out.println("原数组变成了:" + Arrays.toString(names));
        }
    }

    public static boolean deleteName(String[] names, String name) {
        boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                names[i] = null;
                flag = true;
            }
        }
        return flag;
    }

    public static boolean updateName(String[] names, String name1, String name2) {
        boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name1)){
                names[i] = name2;
                flag = true;
            }
        }
        return flag;
    }

    public static int selectName(String[] names, String name) {
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
