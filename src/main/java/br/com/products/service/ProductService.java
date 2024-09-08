package br.com.products.service;

import br.com.products.Dto.ProductDto;
import br.com.products.Dto.PromotionDto;
import br.com.products.service.WireMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private WireMockService wireMockService;

    public Map<String, Object> calculateTotalWithPromotions(PromotionDto itemIds) {
        List<PromotionDto> list = new ArrayList<>();
        list.add(itemIds);
        List<ProductDto> items = wireMockService.getItems();
        

        double total = 0;
        double savings = 0;
        double totalSale = 0;

        for (PromotionDto itemId : list) {
            ProductDto item = items.stream().filter(i -> i.id().equals(itemId.itemId())).findFirst().orElse(null);

            if (item != null) {
                totalSale += item.price() * itemId.quantity();


                if (itemId != null) {
                    if (itemId.type().equals("DISCOUNT")) {
                        savings += totalSale * itemId.value()/100;
                        total +=  totalSale - savings;
                    } else if (itemId.type().equals("BOGO")) {
                        total+= totalSale;
                    }
                }
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        result.put("savings", savings);

        return result;
    }
}
