package yt.gk.demo2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Demo2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2ServiceApplication.class, args);
    }
}
