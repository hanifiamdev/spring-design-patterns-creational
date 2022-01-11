package com.hanifiamdev.springcreational.factory.abstracts.gopay;

import com.hanifiamdev.springcreational.factory.abstracts.ChargePaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    };

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    };


}
