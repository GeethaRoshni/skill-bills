package com.skill.bills.services;

import com.skill.bills.dtos.SellerDto;
import com.skill.bills.entity.Seller;
import com.skill.bills.mappers.SellerMapper;
import com.skill.bills.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private SellerMapper sellerMapper;

    public List<SellerDto> getAll() {
        List<Seller> sellerDetails = sellerRepository.findAll();
        return sellerMapper.sellersToSellerDtos(sellerDetails);
    }
}
