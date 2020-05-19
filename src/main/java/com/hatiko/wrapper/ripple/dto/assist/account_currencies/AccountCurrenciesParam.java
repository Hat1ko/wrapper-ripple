package com.hatiko.wrapper.ripple.dto.assist.account_currencies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCurrenciesParam {

    @JsonProperty("account")
    String account;
    @JsonProperty("ledger_hash")
    String ledgerHash;
    @JsonProperty("ledger_index")
    String ledgerIndex;
    @JsonProperty("strict")
    Boolean strict;
}
