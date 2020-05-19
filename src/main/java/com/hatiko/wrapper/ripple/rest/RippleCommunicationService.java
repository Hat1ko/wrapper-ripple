package com.hatiko.wrapper.ripple.rest;

import com.hatiko.wrapper.ripple.dto.request.BlockchainRequest;
import com.hatiko.wrapper.ripple.dto.response.AccountCurrenciesResponse;
import com.hatiko.wrapper.ripple.dto.response.AccountInfoResponse;

public interface RippleCommunicationService {
    AccountInfoResponse getAccountChannels(BlockchainRequest accountInfoRequest);
    AccountCurrenciesResponse getAccountCurrencies(BlockchainRequest accountCurrenciesResponse);
    void getAccountInfo();
    void getAccountLines();
    void getAccountObjects();
    void getAccountOffers();
    void getAccountTransactions();
    void getGatewayBalances();
}
