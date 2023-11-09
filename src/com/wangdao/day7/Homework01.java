package com.wangdao.day7;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework01 {
    public static void main(String[] args) {
        Account account01 = new Account();
        Account account02 = new Account("123456", 1000);
        account01.print();
        account02.print();
        double balanceAll = account02.sumBalance(10, 0.0031);
        System.out.println(balanceAll);
    }
}

class Account {
    static int count =10000;
    int id;
    String password = "000000";
    double balance = 0.003;
    double rateOfSaving;
    {
        id = ++count;
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;
    }

    public Account() {
    }

    public void print() {
        System.out.println("Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfSaving=" + rateOfSaving +
                '}');
    }

    public double sumBalance(int year, double rate) {
        return balance + balance * year * rate;
    }
}
