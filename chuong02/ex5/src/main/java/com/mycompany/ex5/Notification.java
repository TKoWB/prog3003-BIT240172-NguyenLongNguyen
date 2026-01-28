/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex5;

/**
 *
 * @author Admin
 */
public class Notification {

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        if (messageService == null) {
            System.out.println("MessageService not set");
            return;
        }
        messageService.sendMessage(message);
    }
}

