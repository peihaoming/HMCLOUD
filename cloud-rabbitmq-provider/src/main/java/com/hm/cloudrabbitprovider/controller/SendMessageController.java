package com.hm.cloudrabbitprovider.controller;

import com.hm.cloudrabbitprovider.service.MyMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/10/19 20:07
 * @Description:
 */
@RestController
public class SendMessageController {

    private final MyMessageProvider MyMessageProvider;

    @Autowired
    public SendMessageController( MyMessageProvider MyMessageProvider) {
        this.MyMessageProvider = MyMessageProvider;
    }

    @GetMapping("/send")
    public void sendMessage(){
        MyMessageProvider.sendMessage();
    }
}
