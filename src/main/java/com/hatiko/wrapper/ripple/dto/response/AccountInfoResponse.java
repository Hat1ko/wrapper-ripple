package com.hatiko.wrapper.ripple.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hatiko.wrapper.ripple.dto.assist.account_info.AccountData;
import com.hatiko.wrapper.ripple.dto.assist.account_info.QueueData;
import com.hatiko.wrapper.ripple.dto.assist.account_info.signer_list.SignerList;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountInfoResponse {

    @JsonProperty("account_data")
    AccountData accountData;

    @JsonProperty("signer_lists")
    List<SignerList> signerLists;

    @JsonProperty("ledger_current_index")
    Integer ledgerCurrentIndex;

    @JsonProperty("ledger_index")
    Integer ledgerIndex;

    @JsonProperty("queue_data")
    QueueData queueData;

    @JsonProperty("validated")
    Boolean validated;
}
