package com.wangdao.day8;

import java.util.concurrent.BrokenBarrierException;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId("sdf");
        account.setPwd("102555");
        account.setBalance(565);
    }
}

class Account {
    private String id;
    private String pwd;
    private double balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() < 4 || id.length() > 6){
            System.out.println("请输入合法的用户名！");
            return;
        }
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() != 6) {
            System.out.println("请输入合法的密码！");
            return;
        }
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 100) {
            System.out.println("余额需大于100！");
            return;
        }
        this.balance = balance;
    }
}
