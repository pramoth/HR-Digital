package com.example.hrd.repo;

import com.example.hrd.domain.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepo extends JpaRepository<Leave,Integer> {

}
