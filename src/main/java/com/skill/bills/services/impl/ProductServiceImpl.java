package com.skill.bills.services.impl;

import com.skill.bills.dtos.ManufacturerDto;
import com.skill.bills.dtos.ProductDto;
import com.skill.bills.entity.Manufacturer;
import com.skill.bills.entity.Product;
import com.skill.bills.repository.ProductRepository;
import com.skill.bills.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductDto> getAll() {
        List<ProductDto> products = new ArrayList<>();
        List<Product> productEntities = productRepository.findAll();
        // Enhanced for loop
        for (Product product : productEntities) {
            ManufacturerDto manufacturerDto = new ManufacturerDto();
            Manufacturer manufacturer = product.getManufacturer();
            manufacturerDto.setId(manufacturer.getId());
            manufacturerDto.setName(manufacturer.getName());

            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setBarcode(product.getBarcode());
            productDto.setManufacturer(manufacturerDto);
            products.add(productDto);
        }
        return products;
    }

    @Override
    public Optional<ProductDto> findById(long id) {
        Optional<Product> productEntity = productRepository.findById(id);
        if (!productEntity.isPresent()) {
            return Optional.empty();
        }
        Product product = productEntity.get();
        ManufacturerDto manufacturerDto = new ManufacturerDto();
        Manufacturer manufacturer = product.getManufacturer();
        manufacturerDto.setId(manufacturer.getId());
        manufacturerDto.setName(manufacturer.getName());

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setBarcode(product.getBarcode());
        productDto.setManufacturer(manufacturerDto);
        return Optional.of(productDto);
    }

    @Override
    public ProductDto save(ProductDto product) {
        return null;
    }
}
