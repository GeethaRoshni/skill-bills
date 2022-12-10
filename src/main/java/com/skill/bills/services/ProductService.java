package com.skill.bills.services;

import com.skill.bills.dtos.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<ProductDto> getAll();
    Optional<ProductDto> findById(long id);
    ProductDto save(ProductDto product);
}
