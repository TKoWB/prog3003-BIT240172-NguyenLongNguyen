/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex02;

/**
 *
 * @author Admin
 */
public class CacThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i<= 10; i++){
            System.out.println(Thread.currentThread().getName()+ ": " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
