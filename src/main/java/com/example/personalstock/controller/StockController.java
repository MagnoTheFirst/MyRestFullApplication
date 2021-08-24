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
    @CrossOrigin(origins = "http://localhost:8081/list.html", maxAge = 3600)
    public List<Stock> getStock(){
        return stockService.getStocks();
    }

    @CrossOrigin
    @GetMapping(path = "{stockId}")
    public Optional<Stock> getSpecificStock(@PathVariable("stockId") Long id){
        return stockService.getStockById(id);
    }

    @CrossOrigin
    @GetMapping(path = "{stockName}")
    public Optional<Stock> getSpecificStockByName(@PathVariable("stockName") String name){
        return stockService.getStockByName(name);
    }

    @PostMapping
    public void addNewStock(@RequestBody Stock stock){
        stockService.addNewPersonalStock(stock);

    }

    @DeleteMapping(path = "{stockId}")
    public void removeOneStockObject(@PathVariable("stockId") Long id){
        stockService.removeOneStockObject(id);
    }


    @PutMapping(path = "{stockId}")
    public void updateStockObject(
            @PathVariable("stockId")Long stockId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description){
        stockService.updateStock(stockId, name, description);
    }

}

