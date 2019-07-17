package com.lee.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangLe
 * @date 2019/1/3 16:46
 * @description 通过该注解,让该应用注册为Eureka客户端应用,以获得服务发现的能力
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
