/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bai3;
/**
 *
 * @author Admin
 */

import java.util.concurrent.CompletableFuture;

public class BankingService {

    public CompletableFuture<String> verifyCustomer(String accountId) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Verifying customer info...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            if (accountId == null || accountId.isEmpty()) {
                throw new RuntimeException("Invalid Customer ID!");
            }
            
            System.out.println("Step 1: Customer verified.");
            return "Verified";
        });
    }

    public CompletableFuture<String> checkBalance(String accountId, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Checking account balance...");
                Thread.sleep(1200);
            } catch (InterruptedException e) {}

            if (amount > 1000.0) {
                throw new RuntimeException("Insufficient funds!");
            }

            System.out.println("Step 2: Balance checked.");
            return "Balance OK";
        });
    }

    public CompletableFuture<String> transferMoney(String from, String to, double amount) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Transferring money...");
                Thread.sleep(1500);
            } catch (InterruptedException e) {}

            System.out.println("Step 3: Transfer completed.");
            return "Success: $" + amount + " moved to " + to;
        });
    }
}