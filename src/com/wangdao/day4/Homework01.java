package com.wangdao.day4;

import java.util.Arrays;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        double[] doubles = {2.0, 1.0, 3.0, 5.0, 7.0};
        doubles = method(doubles);
        System.out.println(Arrays.toString(doubles));
    }

    public static double[] method(double[] doubles){
        double temp = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] /= temp;
        }
        return doubles;
    }
}
