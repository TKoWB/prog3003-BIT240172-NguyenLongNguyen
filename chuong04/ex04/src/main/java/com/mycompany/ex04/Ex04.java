/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Admin
 */
public class Ex04 {

    public static void main(String[] args) {
        Function<String,Integer> chuyendoi = doi -> {
            String[] phan = doi.split("(?<=\\$)");
            return Integer.parseInt(phan[1]);
        };
        List<String> Tien = Arrays.asList("$10", "$20");
        
        Tien.forEach(a -> System.out.println(chuyendoi.apply(a)));
        
    }
}
