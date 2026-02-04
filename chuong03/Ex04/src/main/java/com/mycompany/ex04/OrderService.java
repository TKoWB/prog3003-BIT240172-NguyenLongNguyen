/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex04;
import java.util.concurrent.CompletableFuture;
/**
 *
 * @author Admin
 */


public class OrderService {
    public CompletableFuture<String> checkInventory() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Dang kiem tra kho hang...");
                Thread.sleep(1500);
            } catch (InterruptedException e) {}
            System.out.println("Da xong: San pham co san.");
            return "Kho: Xong";
        });
    }

    public CompletableFuture<String> processPayment() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Dang xu ly thanh toan...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println("Da xong: Thanh toan thanh cong.");
            return "Thanh toan: Xong";
        });
    }

    public CompletableFuture<String> arrangeShipping() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Dang ket noi van chuyen...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Da xong: Don vi van chuyen xac nhan.");
            return "Van chuyen: Xong";
        });
    }
}