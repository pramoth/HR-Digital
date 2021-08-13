package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeType {
    @Id private Integer id;
    private String nameEmpType;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEmpType() {
        return nameEmpType;
    }
    public void setNameEmpType(String nameEmpType) {
        this.nameEmpType = nameEmpType;
    }
}
