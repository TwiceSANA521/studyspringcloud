package com.feign.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-wang-user")
public interface Service {
    @RequestMapping(value = "hi" , method= RequestMethod.GET)
    public String sayHi(@RequestParam(value="message") String message);
}
