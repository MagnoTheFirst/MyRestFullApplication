package com.example.personalstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PersonalStockApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalStockApplication.class, args);
    }

}
