package com.dikbiyik.ws.country.mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dikbiyik.ws.country.dto.request.CountryDtoRequest;
import com.dikbiyik.ws.country.dto.response.CountryDtoResponse;
import com.dikbiyik.ws.country.model.Country;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    
    @Mapping(target = "id", ignore = true)
    Country countryDtoRequestToCountry(CountryDtoRequest countryDto);

    Country countryDtoResponseToCountry(CountryDtoResponse countryDto);

    CountryDtoResponse countryToCountryDto(Country countryOpt);

    List<CountryDtoResponse> countriesToCountryDtos(List<Country> countries);

    List<Country> countryDtosToCountries(List<CountryDtoRequest> countryDtos);
}
