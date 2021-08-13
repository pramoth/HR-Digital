package com.example.hrd.repo;

import com.example.hrd.domain.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepo extends JpaRepository<EmployeeType,Integer> {
}
