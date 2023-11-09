package com.wangdao.day6;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Student student01 = new Student("jack", 01, "male", 10, 85);
        Student student02 = new Student("tom", 02, "male", 19, 75);
        Student student03 = new Student("smith", 03, "male", 10, 77);
        Student student04 = new Student("mary", 04, "female", 10, 87);
        Student student05 = new Student("jerry", 01, "male", 10, 85);
        Student[] students = {student01,student02,student03, student04, student05};
        printAll(students);
        System.out.println("平均分为 " + averageScore(students));
    }

    public static void printAll(Student[] students) {
        for (Student student : students) {
            student.print();
        }
    }

    public static double averageScore(Student[] students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.score;
        }
        return sum / students.length;
    }
}

class Student {
    String name;
    int stuId;
    String gender;
    int age;
    double score;

    public Student() {

    }

    public Student(String name, int stuId, String gender, int age, double score) {
        this.name = name;
        this.stuId = stuId;
        this.gender = gender;
        this.age = age;
        this.score = score;
    }

    public void print() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", stuId=" + stuId +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}');
    }
}
