package br.com.products.controller;

import br.com.products.Dto.ProductDto;
import br.com.products.Dto.PromotionDto;
import br.com.products.service.ProductService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Object>> calculateTotal(@RequestBody  PromotionDto itemIds) {
        return ResponseEntity.ok(productService.calculateTotalWithPromotions(itemIds));
    }
}
