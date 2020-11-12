package com.example.payservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class PayServiceApplication {

    @Value("${cache:default}")
    private String cache;

    @GetMapping(value = "/hello")
    public String show()
    {
        return cache;
    }

    public static void main(String[] args) {
        SpringApplication.run(PayServiceApplication.class, args);
    }

}
