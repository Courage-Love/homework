package com.wangdao.day4;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {
    public static void main(String[] args) {
        double[] scores = {10, 8, 9, 5, 6, 7, 4, 6, 8, 10};
        double max = maxScore(scores);
        double min = minScore(scores);
        double finalScore = valScore(scores, max, min );
        System.out.println(finalScore);
    }

    public static double maxScore(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static double minScore(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static double valScore(double[] scores, double max, double min) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        sum = sum - max - min;
        return sum / 8;
    }
}
