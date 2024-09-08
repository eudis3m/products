package br.com.products.service;

import br.com.products.Dto.ProductDto;
import br.com.products.Dto.PromotionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class WireMockService {

    @Autowired
    private RestTemplate restTemplate;

    public List<ProductDto> getItems() {
        ResponseEntity<ProductDto[]> response = restTemplate.getForEntity("http://localhost:8080/products", ProductDto[].class);
        return Arrays.asList(response.getBody());
    }


}
