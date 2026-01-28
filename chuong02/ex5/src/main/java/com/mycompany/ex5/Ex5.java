/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

/**
 *
 * @author Admin
 */
public class Ex5 {

    public static void main(String[] args) {

        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Test Email");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Test SMS");
    }
}
