package com.skill.bills.services;

import com.skill.bills.dtos.CustomerDetailsDto;
import com.skill.bills.entity.CustomerDetails;
import com.skill.bills.repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerDetailsService {
    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    public List<CustomerDetailsDto> getAll() {

        List<CustomerDetailsDto> customerDetailsDtos = new ArrayList<>();
        List<CustomerDetails> customerDetails = customerDetailsRepository.findAll();
        // Enhanced for loop
        for (CustomerDetails customerDetails1 : customerDetails) {

            CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();

            customerDetailsDto.setId(customerDetails1.getId());
            customerDetailsDto.setAadharNo(customerDetails1.getAadharNo());
            customerDetailsDto.setAddress(customerDetails1.getAddress());
            customerDetailsDto.setAltmobile(customerDetails1.getAltmobile());
            customerDetailsDto.setCompanyName(customerDetails1.getCompanyName());
            customerDetailsDto.setFatherName(customerDetails1.getFatherName());
            customerDetailsDto.setMobile(customerDetails1.getMobile());
            customerDetailsDto.setFirstName(customerDetails1.getFirstName());
            customerDetailsDto.setLastName(customerDetails1.getLastName());
            customerDetailsDto.setCompanyAddress(customerDetails1.getCompanyAddress());
            customerDetailsDto.setMonthlyIncome(customerDetails1.getMonthlyIncome());
            customerDetailsDto.setOccupation(customerDetails1.getOccupation());
            customerDetailsDto.setMailId(customerDetails1.getMailId());
            customerDetailsDto.setPanNo(customerDetails1.getPanNo());
            customerDetailsDtos.add(customerDetailsDto);
        }
        return customerDetailsDtos;
    }
    public CustomerDetailsDto findById(Long id) {
        CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();
        Optional<CustomerDetails> customerDetails = customerDetailsRepository.findById(id);

        CustomerDetails customerDetails1 = new CustomerDetails();
        customerDetails1 = customerDetails.get();

        customerDetailsDto.setId(customerDetails1.getId());
        customerDetailsDto.setAadharNo(customerDetails1.getAadharNo());
        customerDetailsDto.setAddress(customerDetails1.getAddress());
        customerDetailsDto.setAltmobile(customerDetails1.getAltmobile());
        customerDetailsDto.setCompanyName(customerDetails1.getCompanyName());
        customerDetailsDto.setFatherName(customerDetails1.getFatherName());
        customerDetailsDto.setMobile(customerDetails1.getMobile());
        customerDetailsDto.setFirstName(customerDetails1.getFirstName());
        customerDetailsDto.setLastName(customerDetails1.getLastName());
        customerDetailsDto.setCompanyAddress(customerDetails1.getCompanyAddress());
        customerDetailsDto.setMonthlyIncome(customerDetails1.getMonthlyIncome());
        customerDetailsDto.setOccupation(customerDetails1.getOccupation());
        customerDetailsDto.setMailId(customerDetails1.getMailId());
        customerDetailsDto.setPanNo(customerDetails1.getPanNo());
           // customerDetailsDtos.add(customerDetailsDto);

        return customerDetailsDto;



    }
}
