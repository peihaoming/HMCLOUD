package com.hm.cloudrabbitprovider.service.impl;

import com.hm.cloudrabbitprovider.service.MyMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @Auther: haomingp
 * @Date: 2020/10/19 20:00
 * @Description:
 */
@EnableBinding(Source.class)  //定义消息的通信管道
public class MessageProviderImpl implements MyMessageProvider {

    @Qualifier("output")
    @Autowired
    private MessageChannel outPut;

    @Override
    public String sendMessage() {
        String serial = UUID.randomUUID().toString();
        outPut.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***************serial"+serial+"***************");
        return null;
    }
}
