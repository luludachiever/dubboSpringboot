package com.dubboFilterHw.consumer;

import org.springframework.context.annotation.ImportResource;

@org.springframework.context.annotation.Configuration
@ImportResource(locations={"classpath*:dubbo-consumer.xml"})
public class Configuration {
}