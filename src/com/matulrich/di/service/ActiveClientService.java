package com.matulrich.di.service;

import com.matulrich.di.model.Client;
import com.matulrich.di.notification.Notification;

public class ActiveClientService {

    private Notification notification;

    public ActiveClientService(Notification notification) {
        this.notification = notification;
    }

    public void active(Client client) {
        client.active();
        this.notification.notify(client, "Seu cadastro no sistema está ativo");
    }
}
