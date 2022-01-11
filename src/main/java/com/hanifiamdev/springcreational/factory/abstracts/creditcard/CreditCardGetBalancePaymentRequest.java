package com.hanifiamdev.springcreational.factory.abstracts.creditcard;

import com.hanifiamdev.springcreational.factory.abstracts.GetBalancePaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
