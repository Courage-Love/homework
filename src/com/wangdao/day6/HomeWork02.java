package com.wangdao.day6;

/**
 * @version 1.0
 * @auther cxw
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("张三", 18, "男", 1);
        Teacher teacher2 = new Teacher("李四", 25, "女", 2);
        teacher1.print();
        teacher2.print();
    }
}

class Teacher {
    private String name;
    private int age;
    private String gender;
    int teacherId;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public Teacher(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Teacher(String name, int age, String gender, int teacherId) {
        this(name, age, gender);
        this.teacherId = teacherId;
    }

    public void print() {
        System.out.println("Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", teacherId=" + teacherId +
                '}');
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
