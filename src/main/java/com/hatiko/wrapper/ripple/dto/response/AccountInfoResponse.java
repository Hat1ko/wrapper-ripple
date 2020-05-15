package com.hatiko.wrapper.ripple.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hatiko.wrapper.ripple.dto.assist.account_info.AccountData;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountInfoResponse {

    @JsonProperty("account_data")
    AccountData accountData;

}
