package com.hm.cloudgatewaygateway9092.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

/**
 * @Auther: haomingp
 * @Date: 2020/10/13 19:20
 * @Description:
 */
@Component
public class MyLogFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("================gateway过滤器启动================"+ LocalDateTime.now());
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if(StringUtils.isBlank(userName)){
            System.out.println("================非法用户================");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }else

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
