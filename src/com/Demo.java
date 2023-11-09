package com;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @auther cxw
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {

            System.out.println(random.nextInt(10));
        }
    }
}
