/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.bai2;

/**
 *
 * @author Admin
 */


public class PaymentFactory {
    public enum PaymentType {
        CREDIT_CARD, PAYPAL, CASH
    }

    public static PaymentMethod createPayment(PaymentType type) {
        return switch (type) {
            case CREDIT_CARD -> new CreditCardPayment();
            case PAYPAL -> new PayPalPayment();
            case CASH -> new CashPayment();
            default -> throw new IllegalArgumentException("Unknown payment type");
        };
    }
}