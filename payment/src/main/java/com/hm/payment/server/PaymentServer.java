package com.hm.payment.server;

import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: haomingp
 * @Date: 2020/9/30 11:28
 * @Description:
 */
@Service
public class PaymentServer {

    public String paymentInfo_isOk(Integer id){
        return "线程池"+Thread.currentThread().getName()+"paymentId"+id+"\t"+"(*^▽^*)";
    }

    public String paymentInfo_isTmeOut(Integer id){
        String s = IdUtil.simpleUUID();
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"paymentId"+id+"\t"+"(*^▽^*)，耗时";
    }
}
