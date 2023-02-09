package com.learn.notifydemo.modules.notify.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class OneSignalNotificationModel {

    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("include_external_user_ids")
    private Set<String> userIds;

    @JsonProperty("include_player_ids")
    private Set<String> includePlayerIds;

    @JsonProperty("included_segments")
    private List<String> includedSegments;

    @JsonProperty("email_subject")
    private String emailSubject;

    @JsonProperty("email_body")
    private String emailBody;

    @JsonProperty("channel_for_external_user_ids")
    private String channel;

    @JsonProperty("contents")
    private Map<String, String> contents;
}
