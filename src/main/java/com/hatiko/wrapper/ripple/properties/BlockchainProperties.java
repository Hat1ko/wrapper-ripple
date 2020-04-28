package com.hatiko.wrapper.ripple.properties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@ConfigurationProperties("blockchain")
@Component
public final class BlockchainProperties {

    String uri;
    Timeout timeout;
    Method method;

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static final class Timeout {

        Integer read;
        Integer connect;
    }

    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public static final class Method {

        String accountChannels;
        String accountCurrencies;
        String accountInfo;
        String accountLines;
        String accountObjects;
        String accountTransactions;
        String gatewayBalances;

        String sign;
        String signFor;
        String submit;

        String transaction;
    }

}
