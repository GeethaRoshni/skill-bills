package com.skill.bills.services;

import com.skill.bills.dtos.AlertDto;
import com.skill.bills.entity.Alert;
import com.skill.bills.repository.AlertRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {
    @Autowired
    AlertRespository alertRespository;

    public List<Alert> getAll(){
        return alertRespository.findAll();
    }
}
