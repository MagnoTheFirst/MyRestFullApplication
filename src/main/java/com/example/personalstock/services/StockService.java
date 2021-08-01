package com.example.personalstock.services;

import com.example.personalstock.entities.Stock;
import com.example.personalstock.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StockService {

    private final StockRepository stockrepo;

    @Autowired
    public StockService(StockRepository stockrepo) {
        this.stockrepo = stockrepo;
    }

    public List<Stock> getStocks(){
        return stockrepo.findAll();
    }

    public Optional<Stock> getStockByName(String name){
        return stockrepo.findByName(name);
    }


    public void addNewPersonalStock(Stock stock){
        stockrepo.saveAndFlush(stock);
    }


    public void removeOneStockObject(Long stockId) {
        stockrepo.deleteById(stockId);
    }



}