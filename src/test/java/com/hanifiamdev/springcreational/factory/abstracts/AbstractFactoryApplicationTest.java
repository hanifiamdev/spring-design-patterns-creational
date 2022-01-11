package com.hanifiamdev.springcreational.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryBcaKlikpay = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
        PaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

        // misal proses charge untuk semua metode pembayaran
        charge(paymentFactoryCreditCard);
        charge(paymentFactoryBcaKlikpay);
        charge(paymentFactoryGopay);

    }

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(1000000L);

        // misal kirim ke payment gateway
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("xxx");

    }

    public Long getBalance(PaymentFactory paymentFactory) {
        try{
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("Hanif");

            // send to payment gateway
            return 1000L;
        } catch (UnsupportedOperationException exception) {
            return 0L;
        }


    }




}