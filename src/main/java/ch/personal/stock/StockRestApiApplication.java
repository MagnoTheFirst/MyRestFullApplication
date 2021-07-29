package ch.personal.stock;

import ch.personal.stock.entities.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@RestController
public class StockRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockRestApiApplication.class, args);

    }
    @GetMapping
    public List<Stock> hello(){
        return List.of(
                new Stock
                        (1L,
                         "Desktop",
                         "Asus Game Republic Desktop. 32 inches",
                         LocalDate.of(2021,Month.MAY,01),
                        999.00,
                        "Multimedia",
                        5, LocalDate.of(2021,Month.MAY,01),
                        "Asus"
                        )
        );
    }
}
