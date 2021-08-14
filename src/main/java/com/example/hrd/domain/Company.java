package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
//COMPANY
public class Company {
    @Id
    private Integer id;
    private String name;
    //...
    //Uni-directional relation
    //COMPANY ---COMPANY_DEPARTMENT----DEPARTMENT

    //Bi-directional
    //COMPANY ---- DEPARTMENT
    @OneToMany(mappedBy = "company")
    private List<Department> departments;
}
