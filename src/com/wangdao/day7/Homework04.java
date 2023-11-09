package com.wangdao.day7;

import java.util.ArrayList;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework04 {
    public static void main(String[] args) {
        ArrayList<Student_> arrayList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            arrayList.add(Student_.getStudent());
        }
        for (Student_ student_ : arrayList) {
            System.out.println(student_);
        }
    }
}

class Student_ {
    static int count = 1;

    {
        count++;
    }

    String id;
    String name;

    private Student_(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student_() {
    }

    public static Student_ getStudent() {
        Student_ student = null;
        if (count <= 10) {
            student = new Student_("#" + count, "cxw");
            return student;
        }
        System.out.println("创建失败");
        return student;
    }

    @Override
    public String toString() {
        return "Student_{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}