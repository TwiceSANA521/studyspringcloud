package com.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
       @Autowired
    private RestTemplate restTemplate;
       @GetMapping("/getOrderUser")
       public String getOrderUser(){
           return restTemplate.getForObject("http://USER/getUser",String.class);
       }
}
