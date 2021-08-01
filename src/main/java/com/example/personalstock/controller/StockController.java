package com.example.personalstock.controller;


import com.example.personalstock.entities.Stock;
import com.example.personalstock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/stock")
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public List<Stock> getStock(){
        return stockService.getStocks();
    }

    @PostMapping
    public void addNewStock(@RequestBody Stock stock){
        stockService.addNewPersonalStock(stock);

    }

}

