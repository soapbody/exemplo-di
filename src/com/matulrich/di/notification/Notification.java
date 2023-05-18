package com.matulrich.di.notification;

import com.matulrich.di.model.Client;

public interface Notification {
    void notify(Client client, String message);
}
