package com.basics.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 马运动
 * @date 2020/4/1 16:51
 */
@EnableEurekaServer
@SpringBootApplication
public class EruekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EruekaServerApplication.class,args);
    }
}
