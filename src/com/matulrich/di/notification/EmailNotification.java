package com.matulrich.di.notification;

import com.matulrich.di.model.Client;

public class EmailNotification implements Notification{

    @Override
    public void notify(Client client, String message) {
        System.out.println("Notificando " + client.getEmail() + "através do e-mail " + client.getEmail() + message);
    }
}
