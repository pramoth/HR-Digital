package com.example.hrd;

import com.example.hrd.domain.TimeWork;
import com.example.hrd.repo.TimeWorkRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin (value="*")
//@CrossOrigin(origins = {"http://localhost:8080","http://localhost:4200"})
@RestController
public class TimeWorkController {

    private TimeWorkRepo repo;

    public TimeWorkController(TimeWorkRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/timeWork/{id}")
    public Optional<TimeWork> find(@PathVariable Integer id){
        return repo.findById(id);
    }

    @PostMapping("/timeWork")
    public TimeWork save(@RequestBody TimeWork s){
        return repo.save(s);
    }

    @GetMapping("/timeWork")
    public Page<TimeWork> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }

}
