package com.learn.notifydemo.modules.notify.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Configuration
@ConfigurationProperties("one-signal")
@Data
public class OneSignalProperties {
    private String rootUrl;
    private String appId;

    private String apiKey;

    private Map<String, String> properties;
}
