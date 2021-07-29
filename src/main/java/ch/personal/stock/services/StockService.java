package ch.personal.stock.services;

import ch.personal.stock.entities.Stock;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StockService {

    public StockService() {
    }

    public List<Stock> getStocks(){
        return List.of(
                new Stock
                        (1L,
                                "Desktop",
                                "Asus Game Republic Desktop. 32 inches",
                                LocalDate.of(2021, Month.MAY,01),
                                999.00,
                                "Multimedia",
                                5, LocalDate.of(2021,Month.MAY,01),
                                "Asus"
                        )
        );
    }

}
