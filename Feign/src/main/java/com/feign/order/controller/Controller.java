package com.feign.order.controller;

import com.feign.order.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Service service;
    @RequestMapping(value = "hi",method= RequestMethod.GET)
    public String sayHi(String message) {
        return service.sayHi(message);
    }
}
