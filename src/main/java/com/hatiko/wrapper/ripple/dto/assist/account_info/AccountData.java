package com.hatiko.wrapper.ripple.dto.assist.account_info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountData {

    @JsonProperty("Account")
    String account;

    @JsonProperty("Balance")
    String balance;

    @JsonProperty("Flags")
    Integer flags;

    @JsonProperty("LedgerEntryType")
    String ledgerEntryType;

    @JsonProperty("OwnerCount")
    Integer ownerCount;

    @JsonProperty("PreviousTxnID")
    String previousTxnId;

    @JsonProperty("PreviousTxnLgrSeq")
    Integer previousTxnLgrSeq;

    @JsonProperty("Sequence")
    Integer sequence;

    @JsonProperty("index")
    String index;
}
