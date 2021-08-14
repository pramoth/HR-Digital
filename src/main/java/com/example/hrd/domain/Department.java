package com.example.hrd.domain;

import javax.persistence.*;
import java.util.List;

//DEPARTMENT
// ID,NAME,COMPANY_ID
@Entity
public class Department {
    //ID
    @Id
    private Integer id;
    //NAME
    @Column(name="NAME")
    private String name;

    //COMPANY_ID
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}