package com.wangdao.day4;

import jdk.nashorn.internal.runtime.Scope;

import java.util.Scanner;
import java.util.Set;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        System.out.println("请输入10位同学的成绩: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }
        System.out.println("平均成绩为 " + averageScore(scores));
    }
    public static double averageScore(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / 10;
    }
}
