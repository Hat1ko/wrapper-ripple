package com.hatiko.wrapper.ripple.dto.assist.account_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QueueData {

    @JsonProperty("txn_count")
    Integer txnCount;

    @JsonProperty("auth_change_queued")
    Boolean authChangeQueued;

    @JsonProperty("lowest_sequence")
    Integer lowestSequence;

    @JsonProperty("highest_sequence")
    Integer highestSequence;

    @JsonProperty("max_spend_drops_total")
    String maxSpendDropsTotal;

    @JsonProperty("transactions")
    List<QueueTransaction> transactions;
}
