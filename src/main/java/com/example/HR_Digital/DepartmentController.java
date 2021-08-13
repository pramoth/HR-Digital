package com.example.HR_Digital;



import com.example.HR_Digital.domain.Department;
import com.example.HR_Digital.repo.DepartmentRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;



@RestController
public class DepartmentController {
    private DepartmentRepo repo;

    public DepartmentController(DepartmentRepo repo) {
        this.repo = repo;
    }
    @GetMapping("/department/{id}")
    public Optional<Department> find(@PathVariable Integer id) {
        return repo.findById(id);
    }
    @PostMapping("/department")
    public Department save(@RequestBody Department s){
        return repo.save(s);
    }
    @GetMapping("/department")
    public Page<Department> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
