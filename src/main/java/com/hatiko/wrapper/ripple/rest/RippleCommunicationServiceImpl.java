package com.hatiko.wrapper.ripple.rest;

import com.hatiko.wrapper.ripple.dto.request.BlockchainRequest;
import com.hatiko.wrapper.ripple.dto.response.AccountCurrenciesResponse;
import com.hatiko.wrapper.ripple.dto.response.AccountInfoResponse;
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
    public AccountInfoResponse getAccountChannels(BlockchainRequest accountInfoRequest) {
        return rippleNetwork.postForEntity(blockchainProperties.getUri(), accountInfoRequest, AccountInfoResponse.class).getBody();
    }

    @Override
    public AccountCurrenciesResponse getAccountCurrencies(BlockchainRequest accountCurrenciesRequest) {
        return  rippleNetwork.postForEntity(blockchainProperties.getUri(), accountCurrenciesRequest,
                AccountCurrenciesResponse.class).getBody();
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
