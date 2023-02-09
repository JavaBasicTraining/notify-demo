package com.learn.notifydemo.modules.onesingal.device.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AddDeviceResponse implements Serializable {
    private boolean success;
    private String id;
}
