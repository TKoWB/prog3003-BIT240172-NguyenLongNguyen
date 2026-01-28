/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Email notification");
    }
}