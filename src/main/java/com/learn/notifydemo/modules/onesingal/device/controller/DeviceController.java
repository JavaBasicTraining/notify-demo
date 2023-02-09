package com.learn.notifydemo.modules.onesingal.device.controller;

import com.learn.notifydemo.modules.onesingal.device.factory.IDeviceFactory;
import com.learn.notifydemo.modules.onesingal.device.model.request.AddDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.response.AddDeviceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeviceController implements IDeviceController {
    private final IDeviceFactory iDeviceFactory;
    
    @Override
    public ResponseEntity<AddDeviceResponse> create(AddDeviceRequest request) {
        return iDeviceFactory.create(request);
    }
}
