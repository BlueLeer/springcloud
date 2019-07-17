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

    @RequestMapping(value = "/consumer1", method = RequestMethod.GET)
    public String helloEureka() {
        return restTemplate.getForEntity("http://eureka-client1/index", String.class).getBody();
    }

    @RequestMapping(value = "/consumer2", method = RequestMethod.GET)
    public String helloEureka2() {
        return restTemplate.getForEntity("http://eureka-client2/index", String.class).getBody();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello() {
        return "hello spring cloud!";
    }

    @RequestMapping(value = "/consumeHello", method = RequestMethod.GET)
    public String consumeHello() {
        return restTemplate.postForEntity("http://ribbon-consumer/hello", null, String.class).getBody();
    }

    @RequestMapping(value = "/zhihu", method = RequestMethod.GET)
    public Object getZhiHuNews() {
        return restTemplate.getForEntity("http://news-at.zhihu.com/api/4/news/latest", Object.class).getBody();
    }

}
