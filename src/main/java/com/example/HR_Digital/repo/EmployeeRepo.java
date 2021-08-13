package com.example.HR_Digital.repo;

import com.example.HR_Digital.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
