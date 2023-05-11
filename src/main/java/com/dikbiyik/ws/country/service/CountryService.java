package com.dikbiyik.ws.country.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dikbiyik.ws.country.dto.request.CountryDtoRequest;
import com.dikbiyik.ws.country.dto.response.CountryDtoResponse;
import com.dikbiyik.ws.country.mapper.CountryMapper;
import com.dikbiyik.ws.country.model.Country;
import com.dikbiyik.ws.country.repository.CountryRepository;
import com.dikbiyik.ws.exception.NotFoundException;

@Service
public class CountryService {
    
    private CountryRepository countryRepository;

    private CountryMapper countryMapper;

    public CountryService(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    public CountryDtoResponse getCountryById(Long id){
        Country countryOpt = countryRepository.findById(id).orElseThrow();
        CountryDtoResponse countryDtoResponse = countryMapper.countryToCountryDto(countryOpt);
        
        if(countryDtoResponse == null){
           return null;
        }
        return countryDtoResponse;
    }

    public List<CountryDtoResponse> getAllCountries(){
        List<CountryDtoResponse> countryDtoResponses = countryMapper.countriesToCountryDtos(this.countryRepository.findAll());
        return countryDtoResponses;
    }
    
    public Country saveCountry(CountryDtoRequest countryDto){
        Country countryInDb = countryMapper.countryDtoRequestToCountry(countryDto);
        return this.countryRepository.save(countryInDb);
    }
    
    public void deleteCountry(Long id) {
        CountryDtoResponse countryDto = this.getCountryById(id);
        Country countryInDb = this.countryMapper.countryDtoResponseToCountry(countryDto);
        if(countryInDb == null){
            throw new NotFoundException();
        }
        
        this.countryRepository.delete(countryInDb);
    }

    public CountryDtoResponse updatePresident(Long id, String president){
        CountryDtoResponse countryDtoResponse = this.getCountryById(id);
        countryDtoResponse.setPresident(president);
        Country country = countryMapper.countryDtoResponseToCountry(countryDtoResponse);
        countryRepository.save(country);

        return countryDtoResponse;

    }
}
