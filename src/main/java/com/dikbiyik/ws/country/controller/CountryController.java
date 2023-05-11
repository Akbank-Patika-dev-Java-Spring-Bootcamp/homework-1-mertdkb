package com.dikbiyik.ws.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dikbiyik.ws.country.dto.request.CountryDtoRequest;
import com.dikbiyik.ws.country.dto.response.CountryDtoResponse;
import com.dikbiyik.ws.country.service.CountryService;
import com.dikbiyik.ws.generic.rest.GenericApiResponse;

@RestController
@RequestMapping("api/v1.0/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{id}")
    public GenericApiResponse getCountryById(@PathVariable Long id) {
        CountryDtoResponse country = this.countryService.getCountryById(id);
        return new GenericApiResponse(200, "Success", "151513154", country);
    }

    @GetMapping
    public GenericApiResponse getCountries() {
        List<CountryDtoResponse> countries = this.countryService.getAllCountries();
        return new GenericApiResponse(200, "Success", "165765313", countries);
    }


    @PostMapping
    public GenericApiResponse createCountry(@RequestBody CountryDtoRequest countryDto) {
        this.countryService.saveCountry(countryDto);
        return new GenericApiResponse(200, "Success", "3218613");
    }

    @PutMapping("/{id}")
    public GenericApiResponse updateCountryPresident(@PathVariable Long id, @RequestBody String president){
        this.countryService.updatePresident(id, president);
        return new GenericApiResponse(200, "Success", "3156465135");
    }

    @DeleteMapping("/{id}")
    public GenericApiResponse deleteCountry(@PathVariable Long id){
        this.countryService.deleteCountry(id);
        return new GenericApiResponse(200, "Success", "3165461");
    }
}
