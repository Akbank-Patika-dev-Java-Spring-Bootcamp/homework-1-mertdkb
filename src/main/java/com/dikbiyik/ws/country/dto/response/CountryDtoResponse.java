package com.dikbiyik.ws.country.dto.response;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDtoResponse {
    
    @Id
    private Long id;

    private String name;

    private String president;
}
