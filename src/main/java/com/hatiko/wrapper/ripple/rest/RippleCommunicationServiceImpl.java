package com.hatiko.wrapper.ripple.rest;

import com.hatiko.wrapper.ripple.properties.BlockchainProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class RippleCommunicationServiceImpl implements RippleCommunicationService {

    RestTemplate rippleNetwork;
    BlockchainProperties blockchainProperties;

    @Override
    public void getAccountChannels() {

    }

    @Override
    public void getAccountCurrencies() {

    }

    @Override
    public void getAccountInfo() {

    }

    @Override
    public void getAccountLines() {

    }

    @Override
    public void getAccountObjects() {

    }

    @Override
    public void getAccountOffers() {

    }

    @Override
    public void getAccountTransactions() {

    }

    @Override
    public void getGatewayBalances() {

    }
}
