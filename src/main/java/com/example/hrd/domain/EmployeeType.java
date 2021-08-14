package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class EmployeeType {
    @Id private Integer id;
    private String nameEmpType;

    @OneToMany
    @JoinColumn(name = "EMPLOYEE_TYPE_ID")
    private List<LeaveMaxSetting> leaveMaxRules;

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
