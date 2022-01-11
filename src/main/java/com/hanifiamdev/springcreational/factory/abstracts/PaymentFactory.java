package com.hanifiamdev.springcreational.factory.abstracts;

public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}
