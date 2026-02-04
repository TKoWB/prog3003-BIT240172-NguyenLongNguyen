/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

/**
 *
 * @author Admin
 */
public class Ex01 {

    public static void main(String[] args) {
        
            WorkerThread t1 = new WorkerThread();
            
            Runnable r1 = new WorkerRunnable();
            Thread t2 = new Thread(r1);
            
            t1.start();
            t2.start();
    }
}
