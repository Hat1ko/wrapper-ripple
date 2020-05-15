package com.hatiko.wrapper.ripple.dto.assist.account_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountInfoParam {

    String account;
    @JsonProperty("ledger_hash")
    String ledgerHash;
    @JsonProperty("ledger_index")
    String ledgerIndex;
    @JsonProperty("queue")
    Boolean queue;
    @JsonProperty("signer_lists")
    Boolean signerLists;
    @JsonProperty("strict")
    Boolean strict;
}
