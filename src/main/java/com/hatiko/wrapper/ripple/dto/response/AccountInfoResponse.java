package com.hatiko.wrapper.ripple.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hatiko.wrapper.ripple.dto.assist.account_info.AccountData;
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

    //TODO: implement class for place Object
    @JsonProperty("signer_lists")
    List<Object> signerLists;

    @JsonProperty("ledger_current_index")
    Integer ledgerCurrentIndex;
    @JsonProperty("ledger_index")
    Integer ledgerIndex;

    //TODO: implement class for place Object
    @JsonProperty("queue_data")
    Object queueData;

    @JsonProperty("validated")
    Boolean validated;


}
