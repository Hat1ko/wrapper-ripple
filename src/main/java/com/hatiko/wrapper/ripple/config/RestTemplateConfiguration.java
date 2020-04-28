package com.hatiko.wrapper.ripple.config;

import com.hatiko.wrapper.ripple.properties.BlockchainProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }

    @Bean(name = {"rippleNetwork", "rippleBlockchain", "xrpLedger", "rippleLedger"})
    public RestTemplate rippleNetwork(BlockchainProperties blockchainProperties, RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
                .rootUri(blockchainProperties.getUri())
                .setConnectTimeout(Duration.ofMillis(blockchainProperties.getTimeout().getConnect()))
                .setReadTimeout(Duration.ofMillis(blockchainProperties.getTimeout().getRead()))
                .build();
    }

}
