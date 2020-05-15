package com.hatiko.wrapper.ripple.dto.assist.account_info.signer_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignerList {

    @JsonProperty("LedgerEntryType")
    String ledgerEntryType;

    @JsonProperty("Flags")
    Long flags;

    @JsonProperty("PreviousTxnID")
    String previousTxnId;

    @JsonProperty("PreviousTxnLgrSeq")
    Long previousTxnLgrSeq;

    @JsonProperty("OwnerNode")
    String ownerNode;

    @JsonProperty("SignerEntries")
    List<SignerEntry> signerEntries;

    @JsonProperty("SignerListID")
    Long SignerListId;

    @JsonProperty("SignerQuorum")
    Long signerQuorum;
}
