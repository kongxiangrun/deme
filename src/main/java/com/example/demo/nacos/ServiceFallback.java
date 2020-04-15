package com.example.demo.nacos;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceFallback  implements FallbackFactory<DemodemoApi>{


    @Override
    public DemodemoApi create(Throwable throwable) {

        return new DemodemoApi() {
            @Override
            public String user() {
                return "熔断内容:"+throwable.getMessage();
            }

        };

    }
}
