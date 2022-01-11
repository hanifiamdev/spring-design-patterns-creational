package com.hanifiamdev.springcreational.factory.abstracts.bcaklikpay;

import com.hanifiamdev.springcreational.factory.abstracts.GetBalancePaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
