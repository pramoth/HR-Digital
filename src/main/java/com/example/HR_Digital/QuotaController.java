package com.example.HR_Digital;

import com.example.HR_Digital.domain.Quota;
import com.example.HR_Digital.repo.QuotaRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class QuotaController {
    private QuotaRepo repo;

    public QuotaController(QuotaRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/quota/{id}")
    public Optional<Quota> find(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping("/quota")
    public Quota save(@RequestBody Quota quota){
        return repo.save(quota);
    }

    @GetMapping("/quota")
    public Page<Quota> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
