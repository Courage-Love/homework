package com.wangdao.day5;

import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        String[] strs = {"qaz", "568", "565", "rfv", "wd", "565"};
        String str = "565";
        strs = changeString(strs, str);
        System.out.println(Arrays.toString(strs));
    }

    public static String[] changeString(String[] strs, String str){
        int temp = 0; //记录要删除的个数
        for (String s : strs) {
            if (s.equals(str)){
                temp++;
            }
        }
        String[] strings = new String[strs.length - temp];
        int index = 0; //记录新数组下标
        for (String s : strs) {
            if (! s.equals(str)){
                strings[index++] = s;
            }
        }
        return strings;
    }
}
