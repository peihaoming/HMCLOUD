package com.example.demo.service.impl;

import com.example.demo.service.MyMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther: haomingp
 * @Date: 2020/10/19 20:00
 * @Description:
 */
@EnableBinding(Source.class)  //定义消息的通信管道
public class MessageProviderImpl implements MyMessageProvider {

    @Resource
    private MessageChannel outPut;

    @Override
    public String sendMessage() {
        String serial = UUID.randomUUID().toString();
        outPut.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***************serial"+serial+"***************");
        return null;
    }
}
