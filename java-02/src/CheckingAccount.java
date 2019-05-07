/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 15:59 2019/5/7
 * @Description: _
 * | |
 * | |__   _   _   __ _
 * | '_ \ | | | | / _` |
 * | |_) || |_| || (_| |
 * |_.__/  \__,_| \__, |
 * __/ |
 * |___/
 */

import javax.naming.InsufficientResourcesException;
import java.io.*;

public class CheckingAccount {
    // balance 为余额 number 为卡号
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    // 方法: 存钱
    public void deposit(double amount) {
        balance += amount;
    }

    // 方法: 取钱
    public void withdraw(double amount) throws InsufficientResourcesException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientResourcesException();
        }
    }

    //方法: 返回余额
    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }
}

