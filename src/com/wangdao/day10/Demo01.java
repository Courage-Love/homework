package com.wangdao.day10;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @version 1.0
 * @auther cxw
 */
public class Demo01 {
    public static void main(String[] args) {
        new Thread(() ->
            System.out.println("***")
        ).start();

        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(i);
        int j = calculateNum((left, right) -> left + right);
        System.out.println(j);
        System.out.println("=============================");
        printNum((int value) -> {
            return value % 2 == 0;
        });

        Integer integer = typeCover(s -> Integer.valueOf(s));
        System.out.println(integer);

        String s = typeCover(s1 -> s1 + "四年");
    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void printNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static<R> R typeCover(Function<String, R> function) {
        String str = "1235";
        R result = function.apply(str);
        return  result;
    }
}

