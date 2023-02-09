package com.learn.notifydemo.modules.onesingal.device.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learn.notifydemo.modules.onesingal.common.model.BaseRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class AddDeviceRequest extends BaseRequest {
    @JsonProperty("device_type")
    private int deviceType;

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("language")
    private String language;

    @JsonProperty("external_user_id")
    private String userId;

    @JsonProperty("device_model")
    private String deviceModel;

    @JsonProperty("device_os")
    private String deviceOs;

    @JsonProperty("session_count")
    private int sessionCount;

    @JsonProperty("tags")
    private transient Map<String, Object> tags;

    @JsonProperty("playtime")
    private int playtime;

    @JsonProperty("notification_types")
    private int notificationTypes; // 1 = Subscribed, -2 = Unsubscribed

    @JsonProperty("lat")
    private double latitude;

    @JsonProperty("long")
    private double longitude;

    @JsonProperty("timezone_id")
    private String timezoneId;
}
