package com.hatiko.wrapper.ripple.dto.assist.account_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QueueTransaction {

    @JsonProperty("auth_change")
    Boolean authChange;

    @JsonProperty("fee")
    String fee;

    @JsonProperty("fee_level")
    String feeLevel;

    @JsonProperty("max_spend_drops")
    String maxSpendDrops;

    @JsonProperty("seq")
    Integer seq;
}
