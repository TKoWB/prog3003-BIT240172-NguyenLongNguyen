/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex5;

/**
 *
 * @author Admin
 */
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

