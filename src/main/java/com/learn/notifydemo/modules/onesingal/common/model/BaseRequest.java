package com.learn.notifydemo.modules.onesingal.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public abstract class BaseRequest implements Serializable {
    @JsonProperty("app_id")
    private String appId;
}
