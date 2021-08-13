package com.example.HR_Digital.repo;


import com.example.HR_Digital.domain.Leader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderRepo extends JpaRepository<Leader,Integer> {
}
