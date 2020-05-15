package com.hatiko.wrapper.ripple.dto.assist.account_info.signer_list;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignerEntry {

    @JsonProperty("Account")
    String account;

    @JsonProperty("SignerWeight")
    Integer signerWeight;
}
