package com.learn.notifydemo.modules.notify.factory;

import com.learn.notifydemo.modules.notify.model.PushNotificationModel;

public interface INotifyFactory {
    Object push(PushNotificationModel content);
}
