package com.learn.notifydemo.modules.notify.factory;

import com.learn.notifydemo.modules.notify.config.OneSignalProperties;
import com.learn.notifydemo.modules.notify.model.OneSignalNotificationModel;
import com.learn.notifydemo.modules.notify.model.PushNotificationModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Set;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotifyFactory implements INotifyFactory {
    private final RestTemplate restTemplate;
    private final OneSignalProperties oneSignalProperties;

    private static final String NOTIFICATIONS = "notifications";

    @Override
    public Object push(PushNotificationModel request) {
        String uri = oneSignalProperties.getRootUrl() + oneSignalProperties.getProperties().get(NOTIFICATIONS);
        OneSignalNotificationModel model = OneSignalNotificationModel.builder()
                .appId(oneSignalProperties.getAppId())
                .channel(request.getChannel())
                .contents(request.getContents())
                .emailSubject("dddddddddd")
                .emailBody("<h1>huyha</h1>")
                .includePlayerIds(Set.of("030e9ade-cb86-44b6-9b1a-036b18d5b296"))
                .includedSegments(List.of("Subscribed Users"))
                .userIds(request.getUserIds())
                .build();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setBasicAuth(oneSignalProperties.getApiKey());

        HttpEntity<OneSignalNotificationModel> httpEntity = new HttpEntity<>(model, httpHeaders);

        return restTemplate.exchange(
                uri,
                HttpMethod.POST,
                httpEntity,
                Object.class
        );
    }
}
