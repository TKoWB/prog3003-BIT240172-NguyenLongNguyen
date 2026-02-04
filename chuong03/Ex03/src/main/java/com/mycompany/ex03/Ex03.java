/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author Admin
 */
public class Ex03 {

    public static void main(String[] args) {
        
        int[] arr = {9,3,2,4,5,1,8,6,7};
        
        System.out.println("bat dau tien trinh chinh");
        
        CompletableFuture<Void>  future = 
            CompletableFuture.supplyAsync(() -> {
                sleep(1000);
                return arr;
            })
            
                    
            .thenApply(result -> {
                List<Integer> ListGoc = new ArrayList<>();
                for (int n : arr){
                    ListGoc.add(n);
                }
                return ListGoc;
                
            })
                    
            .thenApply(result ->{
                System.out.println("Truoc khi loc so le: " + result);
                List<Integer> ListSoLe = new ArrayList<>();
                for(int n : result){
                    if (n % 2 != 0){
                        ListSoLe.add(n);
                    }
                }
                return ListSoLe;
            })
            
            .thenApply(result -> {
                System.out.println("truoc khi sap sep: " + result);
                Collections.sort(result);
                
                return result;
            
            })
                
            .thenAccept(result -> 
                System.out.println("ket qua: " + result)
            )
                
            .thenRun(() -> 
                    System.out.println("hoan thanh")
            );
        System.out.println("tien trinh chinh tiep tuc...");
        
        future.join();
        System.out.println("join");
               
        
    
      
        
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
