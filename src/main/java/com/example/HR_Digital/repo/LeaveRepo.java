package com.example.HR_Digital.repo;

import com.example.HR_Digital.domain.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepo extends JpaRepository<Leave,Integer> {

}
