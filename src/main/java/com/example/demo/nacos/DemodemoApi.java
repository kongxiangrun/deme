package com.example.demo.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient( value="demodemo", fallbackFactory = ServiceFallback.class)
//@RequestMapping("/nacos")
public interface DemodemoApi {

    @GetMapping("/user")
    String user();
}


