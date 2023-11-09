package com.wangdao.day13;

import java.util.Objects;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher(26, "mary", new Student(12, "jack", new Star(10, "tom")));
        Teacher teacher1 = teacher.clone();
        System.out.println(teacher1.equals(teacher));
        System.out.println(teacher1.stu);
        System.out.println(teacher.stu);
        System.out.println(teacher1.stu.s);
        System.out.println(teacher.stu.s);
    }
}

class Teacher implements Cloneable{
    int age;
    String name;
    Student stu;

    public Teacher(int age, String name, Student stu) {
        this.age = age;
        this.name = name;
        this.stu = stu;
    }

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        teacher.stu = teacher.stu.clone();
        teacher.stu.s = teacher.stu.s.clone();
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name) && Objects.equals(stu, teacher.stu);
    }

}

class Student implements Cloneable{
    int age;
    String name;
    Star s;

    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(s, student.s);
    }

}

class Star implements Cloneable{
    int age;
    String name;

    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Star clone() throws CloneNotSupportedException {
        return (Star) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return age == star.age && Objects.equals(name, star.name);
    }

}
