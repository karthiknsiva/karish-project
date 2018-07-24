package com.karish.stock.dbservice.repository;

import com.karish.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findByUserName(String userName);
}
