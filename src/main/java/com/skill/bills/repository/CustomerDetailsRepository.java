package com.skill.bills.repository;

import com.skill.bills.entity.CustomerDetails;
import com.skill.bills.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {
   // Optional<Product> findById(long id);

    Optional<CustomerDetails> findById(long id);

}
