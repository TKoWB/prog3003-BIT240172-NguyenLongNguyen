/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex06;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Admin
 */


public class Ex06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int tong = numbers.stream()
                           .filter(n -> n % 2 == 0)
                           .map(n -> n * n)
                           .mapToInt(Integer::intValue)
                           .sum();

        System.out.println("tong: " + tong);
    }
}
