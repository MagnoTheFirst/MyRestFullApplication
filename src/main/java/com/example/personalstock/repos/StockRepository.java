package com.example.personalstock.repos;
import java.time.LocalDate;
import java.util.Optional;

import com.example.personalstock.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StockRepository extends JpaRepository<Stock, Long>
{

    @Query("SELECT DISTINCT s FROM Stock s WHERE s.name = ?1")
    Optional<Stock> findByName(String name);

    @Query("SELECT s FROM Stock s WHERE s.date_of_purchase = ?1")
    Optional<Stock> findByDate_of_purchase(LocalDate date_of_purchase);

    @Query("SELECT s FROM Stock s WHERE s.guarantee = ?1")
    Optional<Stock> findByGuarantee(LocalDate guarantee);

}
