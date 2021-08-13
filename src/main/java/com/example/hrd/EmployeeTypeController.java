package com.example.hrd;

import com.example.hrd.domain.EmployeeType;
import com.example.hrd.repo.EmployeeTypeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeTypeController {
    private EmployeeTypeRepo repo;

    public EmployeeTypeController(EmployeeTypeRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/employeeType/{idEmp_Type}")
    public Optional<EmployeeType> find(@PathVariable Integer idEmp_Type){
        return repo.findById(idEmp_Type);
    }

    @PostMapping("/employeeType")
    public EmployeeType save(@RequestBody EmployeeType s){
        return repo.save(s);
    }

    @GetMapping("/employeeType")
    public Page<EmployeeType> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
