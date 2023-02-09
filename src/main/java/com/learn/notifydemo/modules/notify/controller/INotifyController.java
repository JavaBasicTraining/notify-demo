package com.learn.notifydemo.modules.notify.controller;

import com.learn.notifydemo.modules.notify.model.PushNotificationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/notify")
public interface INotifyController {

    @PostMapping("push-notification")
    ResponseEntity<Object> pushNotification(@RequestBody PushNotificationModel request);
}
