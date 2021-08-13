package com.example.HR_Digital.repo;


import com.example.HR_Digital.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
