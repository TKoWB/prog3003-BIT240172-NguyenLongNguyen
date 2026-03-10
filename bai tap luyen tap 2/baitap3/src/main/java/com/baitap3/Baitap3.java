/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.baitap3;

/**
 *
 * @author Admin
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Baitap3 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Create Ticket");


        CompletableFuture<String> User = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("verification guest information");
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Name: John";
        });


        CompletableFuture<String> Movie = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("verification movie informtion");
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Movie: The Movie";
        });


        CompletableFuture<String> bookingConfirmation = User.thenCombine( Movie, (userStatus, ticketInfo) -> {

            return "-Ticket-\n" + userStatus + "\n" + ticketInfo;
        });
            
        System.out.println("=>Creating Ticket");
        System.out.println(bookingConfirmation.get());
    }
}
