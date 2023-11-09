package com.wangdao.day5;

import java.util.Scanner;

/**
 * @version 1.0
 * @auther cxw
 */
public class StudentManagementSystem02 {
    public static void main(String[] args) {
        startSystem();
    }

    public static void startSystem(){
        printMenu();
    }

    public static void printMenu(){
        Scanner sc = new Scanner(System.in);
        String[] students = new String[200];
        students[0] = "张山";
        students[1] = "李四";
        students[2] = "王五";
        students[3] = "张飞";
        students[4] = "马云";
        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("\n-----------------王道Java学生管理系统-----------------\n");
            System.out.println("                   1.学 生 列 表");
            System.out.println("                   2.增 加 学 生");
            System.out.println("                   3.删 除 学 生");
            System.out.println("                   4.修 改 学 生");
            System.out.println("                   5.查 询 学 生");
            System.out.println("                   6.退 出 系 统\n");
            System.out.print("请选择功能(1-6)：");
            int input = sc.nextInt();
            // 对输入的单个数值做判断,很适合使用switch
            switch (input) {
                case 1:
                    printStuTable(students);
                    break;
                case 2:
                    System.out.print("请输入学生姓名: ");
                    String stuName = sc.next();
                    boolean temp1 = insertStudent(students, stuName);
                    if (!temp1){
                        System.out.println("消息列表内存已满，添加失败！");
                    }
                    break;
                case 3:
                    System.out.print("请输入学生姓名: ");
                    String stuName1 = sc.next();
                    boolean temp2 = deleteStudent(students, stuName1);
                    if (!temp2){
                        System.out.println("学生名不存在，删除失败！");
                    }
                    break;
                case 4:
                    System.out.print("请输入学生姓名: ");
                    String oldName = sc.next();
                    System.out.print("请输入新姓名: ");
                    String newName = sc.next();
                    boolean temp3 = updateStudent(students,oldName, newName);
                    if (!temp3){
                        System.out.println("学生名不存在，修改失败！");
                    }
                    break;
                case 5:
                    System.out.print("请输入学生姓名: ");
                    String stuName2 = sc.next();
                    int index = selectStudent(students, stuName2);
                    if (index == -1){
                        System.out.println("未查询到学生姓名！");
                    } else {
                        System.out.println("该学生的数组下标为 " + index);
                    }
                    break;
                case 6:
                    // 输入6退出后,询问用户是否确认退出
                    System.out.println("确认退出吗（1/2）：");
                    int quitFlag = sc.nextInt();
                    if (quitFlag == 1) {
                        // 用户确认退出,循环变量为false,死循环终止
                        loopFlag = false;
                        System.out.println("感谢使用本系统！");
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }

    public static void printStuTable(String[] students) {
        System.out.println("学生列表如下: ");
        for (String student : students) {
            if (student != null){
                System.out.print("\t" + student);
            }
        }
        System.out.println();
    }

    private static boolean insertStudent(String[] students, String stuName) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = stuName;
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static boolean deleteStudent(String[] students, String name) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])){
                students[i] = null;
                flag = true;
                break;
            }
        }
        return flag;
    }

    private static boolean updateStudent(String[] students, String oldName, String newName) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (oldName.equals(students[i])) {
                students[i] = newName;
                flag = true;
            }
        }
        return flag;
    }

    private static int selectStudent(String[] students, String name) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                index = i;
            }
        }
        return index;
    }
}
