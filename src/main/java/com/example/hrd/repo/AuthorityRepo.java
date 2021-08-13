package com.example.hrd.repo;

import com.example.hrd.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepo extends JpaRepository<Authority,Integer> {
}
