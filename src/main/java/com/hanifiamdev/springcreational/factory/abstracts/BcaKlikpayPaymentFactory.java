package com.hanifiamdev.springcreational.factory.abstracts;

import com.hanifiamdev.springcreational.factory.abstracts.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.bcaklikpay.BcaKlikpayChargePaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.bcaklikpay.BcaKlikpayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BcaKlikpayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BcaKlikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaKlikpayGetBalancePaymentRequest();
    }
}
