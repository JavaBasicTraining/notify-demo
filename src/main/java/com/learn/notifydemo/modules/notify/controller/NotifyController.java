package com.learn.notifydemo.modules.notify.controller;

import com.learn.notifydemo.modules.notify.model.PushNotificationModel;
import com.learn.notifydemo.modules.notify.factory.INotifyFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotifyController implements INotifyController {
    private final INotifyFactory iNotifyFactory;

    @Override
    public ResponseEntity<Object> pushNotification(PushNotificationModel request) {
        return ResponseEntity.ok(iNotifyFactory.push(request));
    }
}
