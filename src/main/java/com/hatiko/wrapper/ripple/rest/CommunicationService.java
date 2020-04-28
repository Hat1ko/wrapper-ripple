package com.hatiko.wrapper.ripple.rest;

public interface CommunicationService {
    void getAccountChannels();
    void getAccountCurrencies();
    void getAccountInfo();
    void getAccountLines();
    void getAccountObjects();
    void getAccountOffers();
    void getAccountTransactions();
    void getGatewayBalances();
}
