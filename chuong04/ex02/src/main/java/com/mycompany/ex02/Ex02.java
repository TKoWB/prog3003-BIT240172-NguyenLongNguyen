/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Ex02 {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        Collections.sort(cities,(a,b)-> a.length() - b.length());
        System.out.println(cities);
        
    }
}
