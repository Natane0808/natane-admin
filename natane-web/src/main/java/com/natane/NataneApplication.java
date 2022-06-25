package com.natane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NataneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NataneApplication.class, args);
    }

}
