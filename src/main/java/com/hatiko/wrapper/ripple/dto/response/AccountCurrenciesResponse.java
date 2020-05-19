package com.hatiko.wrapper.ripple.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCurrenciesResponse {

    @JsonProperty("ledger_hash")
    String ledgerHash;
    @JsonProperty("ledger_index")
    String ledgerIndex;
    @JsonProperty("receive_currencies")
    List<String> receiveCurrencies;
    @JsonProperty("send_currencies")
    List<String> sendCurrencies;
    @JsonProperty("validated")
    Boolean validated;
}
