package com.example.personalstock.entities;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.time.LocalDate;
/*
* Insert quantity of objects you may have more then one
* */
@Entity
@Table
public class Stock {

    @Id
    @SequenceGenerator
            (
                    name="stock_sequence",
                    sequenceName = "stock_sequence",
                    allocationSize = 1
            )
    @GeneratedValue
            (
                    strategy = GenerationType.SEQUENCE,
                    generator = "stock_sequence"
            )
    private Long id;

    private String name;
    private String description;
    private LocalDate date_of_purchase;
    private double price;
    private String type;
    private int durability; // in years
    private LocalDate guarantee;
    private String brand;

    public Stock(Long id,String name, String description, LocalDate date_of_purchase, double price, String type, int durability, LocalDate guarantee, String brand) {
        this.name = name;
        this.description = description;
        this.date_of_purchase = date_of_purchase;
        this.price = price;
        this.type = type;
        this.durability = durability;
        this.guarantee = guarantee;
        this.brand = brand;
    }

    public Stock(String name, String description, LocalDate date_of_purchase, double price, String type, int durability, LocalDate guarantee, String brand) {
        this.name = name;
        this.description = description;
        this.date_of_purchase = date_of_purchase;
        this.price = price;
        this.type = type;
        this.durability = durability;
        this.guarantee = guarantee;
        this.brand = brand;
    }

    public Stock() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(LocalDate date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public LocalDate getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(LocalDate guarantee) {
        this.guarantee = guarantee;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date_of_purchase=" + date_of_purchase +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", durability=" + durability +
                ", guarantee=" + guarantee +
                ", brand='" + brand + '\'' +
                '}';
    }
}