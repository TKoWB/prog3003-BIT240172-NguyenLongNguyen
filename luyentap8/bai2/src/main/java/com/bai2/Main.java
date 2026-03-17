/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bai2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        double totalAmount = 150.75;

        PaymentMethod creditCard = PaymentFactory.createPayment(PaymentFactory.PaymentType.CREDIT_CARD);
        creditCard.processPayment(totalAmount);

        PaymentMethod paypal = PaymentFactory.createPayment(PaymentFactory.PaymentType.PAYPAL);
        paypal.processPayment(89.00);

        PaymentMethod cash = PaymentFactory.createPayment(PaymentFactory.PaymentType.CASH);
        cash.processPayment(20.50);
    }
}