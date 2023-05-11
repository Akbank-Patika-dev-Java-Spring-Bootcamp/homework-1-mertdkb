package com.dikbiyik.ws.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikbiyik.ws.country.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}
