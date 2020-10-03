package com.dubboFilterHw.consumer;

import com.dubboFilterHw.api.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private IHello helloService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return helloService.hello("tom");
    }

}