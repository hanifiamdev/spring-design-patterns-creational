package com.hanifiamdev.springcreational.factory.abstracts.gopay;

import com.hanifiamdev.springcreational.factory.abstracts.CancelPaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
