package com.learn.notifydemo.modules.onesingal.notification.controller;

import com.learn.notifydemo.modules.onesingal.notification.factory.INotificationFactory;
import com.learn.notifydemo.modules.onesingal.notification.model.EmailRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.PushRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.SmsRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController implements INotificationController {
    private final INotificationFactory iNotificationFactory;

    @Override
    public ResponseEntity<Object> email(EmailRequest request) {
        return iNotificationFactory.email(request);
    }

    @Override
    public ResponseEntity<Object> sms(SmsRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Object> push(PushRequest request) {
        return null;
    }
}
