package com.learn.notifydemo.modules.onesingal.device.factory;

import com.learn.notifydemo.modules.notify.config.OneSignalProperties;
import com.learn.notifydemo.modules.onesingal.device.model.request.AddDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.request.GetDetailDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.request.GetListDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.response.AddDeviceResponse;
import com.learn.notifydemo.modules.onesingal.device.model.response.GetDetailDeviceResponse;
import com.learn.notifydemo.modules.onesingal.device.model.response.GetListDeviceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class DeviceFactory implements IDeviceFactory {
    private final RestTemplate restTemplate;
    private final OneSignalProperties properties;

    private static final String NOTIFICATIONS = "notifications";
    private static final String PLAYERS = "players";


    @Override
    public ResponseEntity<AddDeviceResponse> create(AddDeviceRequest request) {
        String uri = properties.getRootUrl() + properties.getProperties().get(PLAYERS);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth(properties.getApiKey());

        HttpEntity<AddDeviceRequest> httpEntity = new HttpEntity<>(
                request.toBuilder()
                        .appId(properties.getAppId())
                        .build(),
                httpHeaders);

        return restTemplate.exchange(
                uri,
                HttpMethod.POST,
                httpEntity,
                AddDeviceResponse.class
        );
    }

    @Override
    public ResponseEntity<GetDetailDeviceResponse> getDetail(GetDetailDeviceRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<GetListDeviceResponse> getList(GetListDeviceRequest request) {
        return null;
    }

}
