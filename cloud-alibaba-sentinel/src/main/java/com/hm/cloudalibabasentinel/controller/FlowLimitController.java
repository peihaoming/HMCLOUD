package com.hm.cloudalibabasentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haomingp
 * @Date: 2020/10/29 11:34
 * @Description:
 */
@RestController
public class FlowLimitController {

    @GetMapping("/test1")
    public String test1(){
        return "-----------test1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "-----------test2";
    }

    @GetMapping("/hotkey")
    @SentinelResource(value = "hotkey",blockHandler = "handler")
    public String test3(@RequestParam(required = false) String p1,
                        @RequestParam(required = false) String p2){
        return "-----------hotkey，热点测试";
    }

    public String handler(String P1, String p2, BlockException exception){
        return "deal-----------hotKey o(╥﹏╥)o";
    }

}
