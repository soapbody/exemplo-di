package com.matulrich.di.notification;

import com.matulrich.di.model.Client;

public class SMSNotification implements Notification{
    @Override
    public void notify(Client client, String message) {
        System.out.println("Notificando " + client.getName() + "por SMS através do telefone " + client.getPhone() + message);
    }
}
