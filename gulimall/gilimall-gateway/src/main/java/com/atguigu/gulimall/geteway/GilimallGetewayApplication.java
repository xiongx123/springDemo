package com.atguigu.gulimall.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启服务发现
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GilimallGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GilimallGetewayApplication.class, args);
    }

}
