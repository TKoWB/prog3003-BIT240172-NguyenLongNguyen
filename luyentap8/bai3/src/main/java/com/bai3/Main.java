/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bai3;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService();
        long startTime = System.currentTimeMillis();

        System.out.println("Starting transaction...");

        CompletableFuture<String> transactionPipeline = bankingService.verifyCustomer("ACC123")
                .thenCompose(v -> bankingService.checkBalance("ACC123", 500.0))
                .thenCompose(v -> bankingService.transferMoney("ACC123", "ACC456", 500.0))
                .handle((result, ex) -> {
                    if (ex != null) {
                        return "Transaction Failed: " + ex.getMessage();
                    }
                    return "Transaction Status: " + result;
                });

        System.out.println(transactionPipeline.join());

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}