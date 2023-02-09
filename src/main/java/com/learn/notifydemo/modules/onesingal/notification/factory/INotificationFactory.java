package com.learn.notifydemo.modules.onesingal.notification.factory;

import com.learn.notifydemo.modules.onesingal.notification.model.EmailRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.PushRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.SmsRequest;
import org.springframework.http.ResponseEntity;

public interface INotificationFactory {
    ResponseEntity<Object> email(EmailRequest request);

    ResponseEntity<Object> sms(SmsRequest request);

    ResponseEntity<Object> push(PushRequest request);
}
