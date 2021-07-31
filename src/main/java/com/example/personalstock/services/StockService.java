package com.example.personalstock.services;

import com.example.personalstock.entities.Stock;
import com.example.personalstock.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



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

}