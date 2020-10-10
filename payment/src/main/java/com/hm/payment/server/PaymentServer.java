package com.hm.payment.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    @HystrixCommand(fallbackMethod = "paymentInfo_isTmeOutHandler",commandProperties =
            {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_isTmeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"paymentId"+id+"\t"+"(*^▽^*)，耗时";
    }

    public String paymentInfo_isTmeOutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()+"paymentInfo_isTmeOutHandler"+"\t"+"o(╥﹏╥)o";
    }
}
