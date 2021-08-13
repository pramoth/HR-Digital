package com.example.hrd;

import com.example.hrd.domain.LeaveType;
import com.example.hrd.repo.LeaveTypeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LeaveTypeController {
    private LeaveTypeRepo repo;

    public LeaveTypeController(LeaveTypeRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/leave_type/{id}")
    public Optional<LeaveType> find(@PathVariable Integer id) {
        return repo.findById(id);
    }

    @PostMapping("/leave_type")
    public LeaveType save(@RequestBody LeaveType leaveType){
        return repo.save(leaveType);
    }

    @GetMapping("/leave_type")
    public Page<LeaveType> findAll(Pageable pageable){
        return repo.findAll(pageable);
    }
}
