/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

/**
 *
 * @author Admin
 */
public class Ex4 {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Thanh toán bằng Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Đổi sang PayPal lúc runtime
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}
