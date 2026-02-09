/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05;
import java.util.function.Consumer;
import java.util.function.Supplier;
/**
 *
 * @author Admin
 */


public class Ex05 {
    public static void main(String[] args) {
        
        Supplier<Double> randomSupplier = () -> Math.random() * 100;
        Consumer<Double> luckyPrinter = num -> System.out.printf("so may man: %.2f%n", num);
        double so = randomSupplier.get();
        luckyPrinter.accept(so);
    }
}
