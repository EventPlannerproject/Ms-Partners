package com.example.ms_partners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsPartnersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPartnersApplication.class, args);
    }

}
