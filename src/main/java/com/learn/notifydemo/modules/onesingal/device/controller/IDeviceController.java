package com.learn.notifydemo.modules.onesingal.device.controller;

import com.learn.notifydemo.modules.onesingal.device.model.request.AddDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.response.AddDeviceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/onesignal/device")
public interface IDeviceController {
    @PostMapping("create")
    ResponseEntity<AddDeviceResponse> create(@RequestBody AddDeviceRequest request);
}
