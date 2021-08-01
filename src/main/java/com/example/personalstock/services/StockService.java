package com.example.personalstock.services;

import com.example.personalstock.entities.Stock;
import com.example.personalstock.repos.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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

    public Optional<Stock> getStockById(Long id){
        return stockrepo.findById(id);
    }

    public void addNewPersonalStock(Stock stock){
        stockrepo.saveAndFlush(stock);
    }


    public void removeOneStockObject(Long stockId) {
        stockrepo.deleteById(stockId);
    }


    @Transactional
    public void updateStock(Long stockId, String name, String description) {
        Stock stock = stockrepo.findById(stockId).orElseThrow(
                () -> new IllegalStateException("stock with id "+ stockId + "does not exist"));
        if(name != null &&
                name.length() > 0 &&
                !Objects.equals(stock.getName(), name)){
            stock.setName(name);
        }

        if(description != null &&
            description.length() > 0 &&
            !Objects.equals(stock.getDescription(), description)){
            stock.setDescription(description);
        }
    }
}