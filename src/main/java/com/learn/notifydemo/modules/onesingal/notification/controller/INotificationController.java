package com.learn.notifydemo.modules.onesingal.notification.controller;

import com.learn.notifydemo.modules.onesingal.notification.model.EmailRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.PushRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.SmsRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/notifications")
public interface INotificationController {
    @PostMapping("email")
    ResponseEntity<Object> email(@RequestBody EmailRequest request);

    @PostMapping("sms")
    ResponseEntity<Object> sms(@RequestBody SmsRequest request);

    @PostMapping("push")
    ResponseEntity<Object> push(@RequestBody PushRequest request);
}
