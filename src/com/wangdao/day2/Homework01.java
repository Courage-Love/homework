package com.wangdao.day2;

import java.util.Scanner;

/**
 * @auther cxw
 * @version 1.0
 */
public class Homework01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数学成绩：");
        double mathScore = scanner.nextDouble();
        System.out.print("请输入语文成绩：");
        double chineseScore = scanner.nextDouble();
        System.out.print("请输入英语成绩：");
        double englishScore = scanner.nextDouble();
        double maxScore = 0; // 最高分
        double minScore = 0; // 最低分
        double temp = 0;
        temp = mathScore > chineseScore ? mathScore : chineseScore;
        maxScore = temp > englishScore ? temp : englishScore;
        temp = mathScore < chineseScore ? mathScore : chineseScore;
        minScore = temp < englishScore ? temp : englishScore;
        System.out.println("平均分为: " + (mathScore + chineseScore + englishScore) / 3);
        System.out.println("最低分为: " + minScore);
        System.out.println("最高分为: " + maxScore);
        System.out.println("总分为: " + (mathScore + chineseScore + englishScore));
    }
}
