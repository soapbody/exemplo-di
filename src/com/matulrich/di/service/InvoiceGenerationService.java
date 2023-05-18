package com.matulrich.di.service;

import com.matulrich.di.model.Client;
import com.matulrich.di.model.Product;
import com.matulrich.di.notification.EmailNotification;
import com.matulrich.di.notification.Notification;

public class InvoiceGenerationService {

    private Notification notification;

    public InvoiceGenerationService(Notification notification) {
        this.notification = notification;
    }

    public void generate(Client client, Product product) {
        this.notification = new EmailNotification();
        notification.notify(client, "Nota fiscal do produto" + product.getName() + "foi emitida!");
    }
}
