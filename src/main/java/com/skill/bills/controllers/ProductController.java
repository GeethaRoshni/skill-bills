package com.skill.bills.controllers;

import com.skill.bills.dtos.ProductDto;
import com.skill.bills.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/all")
	@PreAuthorize("hasRole('ROLE_OPERATOR') or hasRole('ROLE_SUPER') or hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<ProductDto>> getAll() {

		return ResponseEntity.ok().body(productService.getAll());
	}
}
