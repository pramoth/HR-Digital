package com.example.hrd;

import com.example.hrd.domain.Authority;
import com.example.hrd.repo.AuthorityRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

//@CrossOrigin (value="*")
//@CrossOrigin(origins = {"http://localhost:8080","http://localhost:4200"})
@RestController
public class AuthorityController {

    private AuthorityRepo repo;

    public AuthorityController(AuthorityRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/authority/{id}")
    public Optional<Authority> find(@PathVariable Integer id){
        return repo.findById(id);
    }

    @PostMapping("/authority")
    public Authority save(@RequestBody Authority s){
        return repo.save(s);
    }

    @GetMapping("/authority")
    public Page<Authority> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }

}
