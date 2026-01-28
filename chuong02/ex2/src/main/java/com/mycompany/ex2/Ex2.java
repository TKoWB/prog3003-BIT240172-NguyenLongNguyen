/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Admin
 */
public class Ex2 {
    public static void main(String[] args) {

        Notification notification1 =
                NotificationFactory.createNotification("SMS");
        notification1.notifyUser();

        Notification notification2 =
                NotificationFactory.createNotification("EMAIL");
        notification2.notifyUser();
    }
}
