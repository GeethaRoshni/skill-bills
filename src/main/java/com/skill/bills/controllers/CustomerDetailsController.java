package com.skill.bills.controllers;

import com.skill.bills.dtos.CustomerDetailsDto;
import com.skill.bills.services.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin (origins = "*", maxAge = 36000)
@RestController
@RequestMapping ("/api/customer-details")
public class CustomerDetailsController {
    @Autowired
    private CustomerDetailsService customerDetailsService;

    @GetMapping("all")
    @PreAuthorize("hasRole('ROLE_OPERATOR') or hasRole('ROLE_SUPER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<CustomerDetailsDto>> getAll() {
        return ResponseEntity.ok().body(customerDetailsService.getAll());
    }

    @GetMapping(value ="/{id}")
    @PreAuthorize("hasRole('ROLE_OPERATOR') or hasRole('ROLE_SUPER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<CustomerDetailsDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(customerDetailsService.findById(id));
    }

}


