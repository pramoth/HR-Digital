package com.example.hrd.repo;


import com.example.hrd.domain.Leader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderRepo extends JpaRepository<Leader,Integer> {
}
