package com.example.HR_Digital.repo;

import com.example.HR_Digital.domain.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepo extends JpaRepository<EmployeeType,Integer> {
}
