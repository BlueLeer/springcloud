package com.lee.eureka.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author WangLe
 * @date 2019/1/3 16:46
 * @description
 */
@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();

        logger.info("/index, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "WangLe------" + System.currentTimeMillis();
    }
}
