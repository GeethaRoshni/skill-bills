package com.skill.bills.controllers;

import com.skill.bills.entity.Seller;
import com.skill.bills.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*", maxAge = 36000)
@RestController
@RequestMapping("/api/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @GetMapping("/all")
    public ResponseEntity<List<Seller>> retriveAllSellers() {
        return ResponseEntity.ok().body(sellerService.getAllSellers());
    }
}
