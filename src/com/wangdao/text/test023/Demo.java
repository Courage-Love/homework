package com.wangdao.text.test023;

/**
 * @version 1.0
 * @auther cxw
 */
public class Demo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
    }
}

class Student {
    String id;
    String name;
    int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
