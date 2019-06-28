package com.lee.eureka.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangLe
 * @date 2019/1/4 15:20
 * @description
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String helloEureka() {
        return restTemplate.getForEntity("http://eureka-client/index", String.class).getBody();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello() {
        return "hello spring cloud!";
    }

    @RequestMapping(value = "/consumeHello", method = RequestMethod.GET)
    public String consumeHello() {
        return restTemplate.postForEntity("http://ribbon-consumer/hello", null, String.class).getBody();
    }
}
