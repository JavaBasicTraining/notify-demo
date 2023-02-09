package com.learn.notifydemo.modules.onesingal.device.factory;

import com.learn.notifydemo.modules.onesingal.device.model.request.AddDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.request.GetDetailDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.request.GetListDeviceRequest;
import com.learn.notifydemo.modules.onesingal.device.model.response.AddDeviceResponse;
import com.learn.notifydemo.modules.onesingal.device.model.response.GetDetailDeviceResponse;
import com.learn.notifydemo.modules.onesingal.device.model.response.GetListDeviceResponse;
import org.springframework.http.ResponseEntity;

public interface IDeviceFactory {
    ResponseEntity<AddDeviceResponse> create(AddDeviceRequest request);

    ResponseEntity<GetDetailDeviceResponse> getDetail(GetDetailDeviceRequest request);

    ResponseEntity<GetListDeviceResponse> getList(GetListDeviceRequest request);
}
