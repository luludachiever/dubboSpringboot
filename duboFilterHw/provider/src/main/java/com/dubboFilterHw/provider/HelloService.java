package com.dubboFilterHw.provider;
import com.dubboFilterHw.api.IHello;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class HelloService implements IHello {

        @Override
        public String hello(String Ip) {
            System.out.println("hello" + Ip);
            return "hello:"+Ip;
        }
    }
