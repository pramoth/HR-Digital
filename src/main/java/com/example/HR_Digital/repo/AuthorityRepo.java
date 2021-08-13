package com.example.HR_Digital.repo;

import com.example.HR_Digital.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepo extends JpaRepository<Authority,Integer> {
}
