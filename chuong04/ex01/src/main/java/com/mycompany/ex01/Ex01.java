/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

/**
 *
 * @author Admin
 */


public class Ex01 {
    @FunctionalInterface
    public interface tinhtoan{
        float tinh(int a, int b);
    }

    public static void main(String[] args) {
        tinhtoan cong = (a,b) -> a + b;
        tinhtoan tru = (a,b) -> a - b;
        tinhtoan nhan = (a,b) -> a * b;
        tinhtoan chia = (a,b) -> a/b;
        
        System.out.println(cong.tinh(2, 3));
        System.out.println(tru.tinh(2, 3));
        System.out.println(nhan.tinh(2, 3));
        System.out.println(chia.tinh(2, 3));
        
    }
}
