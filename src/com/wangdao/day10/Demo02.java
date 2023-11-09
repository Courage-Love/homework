package com.wangdao.day10;

import java.util.function.IntConsumer;

/**
 * @version 1.0
 * @auther cxw
 */
public class Demo02 {
    public static void main(String[] args) {
        foreachArr(value ->
            System.out.println(value)
        );
    }

    public static void foreachArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }
}


