package com.example.personalstock.config;

import com.example.personalstock.entities.Stock;
import com.example.personalstock.repos.StockRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StockConfig {

    CommandLineRunner commandLineRunner(StockRepository stockRepo){
        return args -> {
            Stock tv = new Stock(
                    "Table",
                    "Made of oak. Brown. 1.00 X 1.60",
                    LocalDate.of(2021, Month.JANUARY,1),
                    999.00, "Environment", 20,
                    LocalDate.of(2023,Month.JANUARY,01 ),
                    "No Name");
            Stock chair = new Stock(
                    "Table",
                    "Made of oak. Grey.",
                    LocalDate.of(2021, Month.JANUARY,1),
                    999.00, "Environment", 20,
                    LocalDate.of(2023,Month.JANUARY,01 ),
                    "No Name");
        };
    }

}
