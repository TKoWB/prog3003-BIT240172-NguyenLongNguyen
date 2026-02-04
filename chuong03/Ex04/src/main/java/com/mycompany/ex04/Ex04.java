/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;
import java.util.concurrent.CompletableFuture;
/**
 *
 * @author Admin
 */


public class Ex04 {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        long startTime = System.currentTimeMillis();

        CompletableFuture<String> inventoryTask = orderService.checkInventory();
        CompletableFuture<String> paymentTask = orderService.processPayment();
        CompletableFuture<String> shippingTask = orderService.arrangeShipping();

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(
                inventoryTask, 
                paymentTask, 
                shippingTask
        );

        allTasks.join(); 

        long endTime = System.currentTimeMillis();
        
        System.out.println("Tong thoi gian: " + (endTime - startTime) + "ms");
        System.out.println("Ket qua: " + inventoryTask.join() + ", " + paymentTask.join() + ", " + shippingTask.join());
    }
}
