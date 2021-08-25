package com.example.personalstock.controller;

import com.example.personalstock.entities.Stock;
import com.example.personalstock.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StockFormController {


    private final StockService stockService;


    @Autowired
    public StockFormController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock_form")
    public String showForm(Model model){
        Stock stock = new Stock();
        model.addAttribute("stock", stock);

        return "stock_form";
    }

    @PostMapping("/stock_form")
    public String submitForm(@ModelAttribute("stock") Stock stock) {
        stockService.addNewPersonalStock(stock);
        System.out.println(stock.toString());
        return "stock_submitted";
    }

    @RequestMapping("/stocks")
    private String listProducts(Model model){
        model.addAttribute("stocks", stockService.getStocks());
        return "stocks_view";
    }
}
