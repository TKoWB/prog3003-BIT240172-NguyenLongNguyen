/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

/**
 *
 * @author Admin
 */
public class Ex02 {

    public static void main(String[] args) {
        CacThread t = new CacThread();

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(t);
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
