package com.example.HR_Digital;

import com.example.HR_Digital.domain.Employee;
import com.example.HR_Digital.repo.EmployeeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    private EmployeeRepo repo;

    public EmployeeController(EmployeeRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/employee/{idEmp}")
    public Optional<Employee> find(@PathVariable Integer idEmp){
        return repo.findById(idEmp);
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee s){
        return repo.save(s);
    }

    @GetMapping("/employee")
    public Page<Employee> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }
}
