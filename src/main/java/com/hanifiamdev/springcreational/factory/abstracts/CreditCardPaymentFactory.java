package com.hanifiamdev.springcreational.factory.abstracts;

import com.hanifiamdev.springcreational.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.creditcard.CreditCardChargePaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        //throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
        return new CreditCardGetBalancePaymentRequest();
    }
}
