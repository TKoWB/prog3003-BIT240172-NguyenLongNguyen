/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
public class NotificationFactory {

    public static Notification createNotification(String channel) {

        if (channel == null) {
            return null;
        }

        if (channel.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } 
        else if (channel.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } 

        return null;
    }
}