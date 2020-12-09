package com.microservice.quotes.repository;

import com.microservice.quotes.model.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote , Long> {
}
