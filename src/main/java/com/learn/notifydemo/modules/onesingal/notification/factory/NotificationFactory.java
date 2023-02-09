package com.learn.notifydemo.modules.onesingal.notification.factory;

import com.learn.notifydemo.modules.notify.config.OneSignalProperties;
import com.learn.notifydemo.modules.onesingal.notification.model.EmailRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.PushRequest;
import com.learn.notifydemo.modules.onesingal.notification.model.SmsRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class NotificationFactory implements INotificationFactory {
    private final RestTemplate restTemplate;
    private final OneSignalProperties properties;

    private static final String NOTIFICATIONS = "notifications";

    @Override
    public ResponseEntity<Object> email(EmailRequest request) {
        String uri = properties.getRootUrl() + properties.getProperties().get(NOTIFICATIONS);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth(properties.getApiKey());

        HttpEntity<EmailRequest> httpEntity = new HttpEntity<>(
                request.toBuilder()
                        .appId(properties.getAppId())
                        .build(),
                httpHeaders);

        return restTemplate.exchange(
                uri,
                HttpMethod.POST,
                httpEntity,
                Object.class
        );
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
