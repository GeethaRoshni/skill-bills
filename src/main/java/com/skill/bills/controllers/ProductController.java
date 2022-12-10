package com.skill.bills.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@GetMapping("/all")
	@PreAuthorize("hasRole('ROLE_OPERATOR') or hasRole('ROLE_SUPER') or hasRole('ROLE_ADMIN')")
	public ResponseEntity userAccess() {
		return ResponseEntity.ok().build();
	}
}
