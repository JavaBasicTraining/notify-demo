package com.learn.notifydemo.modules.onesingal.notification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learn.notifydemo.modules.onesingal.common.model.BaseRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class EmailRequest extends BaseRequest {

    @JsonProperty("email_subject")
    private String emailSubject;

    @JsonProperty("email_body")
    private String emailBody;

    @JsonProperty("email_from_name")
    private String emailFromName;

    @JsonProperty("email_from_address")
    private String emailFromAddress;

    @JsonProperty("email_reply_to_address")
    private String emailReplyToAddress;

    @JsonProperty("email_preheader")
    private String emailPreHeader;

    @JsonProperty("disable_email_click_tracking")
    private boolean disableEmailClickTracking;

    @JsonProperty("included_segments")
    private Set<String> includedSegments;

    @JsonProperty("include_email_tokens")
    private Set<String> includeEmailTokens;

    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("include_unsubscribed")
    private boolean includeUnsubscribed;
}
