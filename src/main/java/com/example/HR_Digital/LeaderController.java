package com.example.HR_Digital;


import com.example.HR_Digital.domain.Leader;
import com.example.HR_Digital.repo.LeaderRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class LeaderController {
    private LeaderRepo repo;

    public LeaderController(LeaderRepo repo) {
        this.repo = repo;
    }
    @GetMapping("/Leader/{id}")
    public Optional<Leader> find(@PathVariable Integer id){
        return repo.findById(id);
    }
    @PostMapping("/Leader")
    public Leader save(@RequestBody Leader s){
        return repo.save(s);
    }
    @GetMapping("/Leader")
    public Page<Leader> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}

