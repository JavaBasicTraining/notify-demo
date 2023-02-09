package com.learn.notifydemo.modules.notify.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class PushNotificationModel implements Serializable {

    private Set<String> userIds;

    private Set<String> includePlayerIds;

    private List<String> includedSegments;

    private String channel;

    private Map<String, String> contents;
}
