package yt.gk.demo1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Demo1ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo1ServiceApplication.class, args);
    }
}
