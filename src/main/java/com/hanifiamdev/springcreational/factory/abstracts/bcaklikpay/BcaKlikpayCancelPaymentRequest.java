package com.hanifiamdev.springcreational.factory.abstracts.bcaklikpay;

import com.hanifiamdev.springcreational.factory.abstracts.CancelPaymentRequest;
import com.hanifiamdev.springcreational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
