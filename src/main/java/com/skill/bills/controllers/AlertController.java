package com.skill.bills.controllers;

import com.skill.bills.entity.Alert;
import com.skill.bills.services.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*", maxAge = 36000)
@RestController
@RequestMapping("api/alert")
public class AlertController {
    @Autowired
    private AlertService alertService;

    @GetMapping("/all")
    public ResponseEntity<List<Alert>> getAll(){
        return ResponseEntity.ok().body(alertService.getAll());
    }
}
