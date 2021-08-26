package com.github.MarianiFracon.citiesapi.countries.repository;

import com.github.MarianiFracon.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
