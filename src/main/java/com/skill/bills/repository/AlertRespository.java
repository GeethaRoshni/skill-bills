package com.skill.bills.repository;

import com.skill.bills.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlertRespository extends JpaRepository<Alert,Long> {
    Optional<Alert> findById(long id);
}
