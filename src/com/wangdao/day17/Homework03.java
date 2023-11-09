package com.wangdao.day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        String[] words = {"verb:eat","verb:drink","verb:sleep","verb:play","noun:rice","noun:meat","noun:hand","noun:hair"};
        writeStr(words);
    }

    private static void writeStr(String[] words) {
        for (String word : words) {
            if (word.contains("verb")) {
                try (FileOutputStream out = new FileOutputStream("a.txt",true)){
                    out.write(word.getBytes());
                    out.write(System.lineSeparator().getBytes());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try (FileOutputStream out = new FileOutputStream("b.txt", true)){
                    out.write(word.getBytes());
                    out.write(System.lineSeparator().getBytes());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
