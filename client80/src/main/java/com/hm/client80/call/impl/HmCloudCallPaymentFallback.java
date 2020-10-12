package com.hm.client80.call.impl;

import com.hm.client80.call.HmCloudCallPayment;
import org.springframework.stereotype.Component;

/**
 * @Auther: haomingp
 * @Date: 2020/10/10 17:12
 * @Description:
 */
@Component
public class HmCloudCallPaymentFallback implements HmCloudCallPayment {
    @Override
    public String getHello(String name) {
        return null;
    }

    @Override
    public String ok() {
        return "------HmCloudCallPaymentFallback fall back ok (灬ꈍ ꈍ灬)";
    }

    @Override
    public String timeout() {
        return "------HmCloudCallPaymentFallback fall back timeout (灬ꈍ ꈍ灬)";
    }

    @Override
    public String paymentOrderIsOk(Integer id) {
        return "------paymentOrderIsOk fall back timeout (灬ꈍ ꈍ灬)";
    }
}
