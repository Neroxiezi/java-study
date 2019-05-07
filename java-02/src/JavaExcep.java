/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 15:44 2019/5/7
 * @Description: _
 * | |
 * | |__   _   _   __ _
 * | '_ \ | | | | / _` |
 * | |_) || |_| || (_| |
 * |_.__/  \__,_| \__, |
 * __/ |
 * |___/
 */

import java.io.*;

public class JavaExcep {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e.getMessage());
        }
        System.out.println("Out of the block");
    }
}
