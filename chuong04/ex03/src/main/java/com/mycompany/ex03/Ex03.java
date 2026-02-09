/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;
import java.util.function.Predicate;
/**
 *
 * @author Admin
 */

public class Ex03 {

    public static void main(String[] args) {
        Predicate<Integer> chan = n -> n % 2 == 0;
        System.out.println(chan.test(3));
        System.out.println(chan.test(2));
        
    }
}
