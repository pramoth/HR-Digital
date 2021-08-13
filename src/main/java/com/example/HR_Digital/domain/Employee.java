package com.example.HR_Digital.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Employee {
    @Id private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDateTime dateBorn;
    private String address;
    private String tel;
    private String position;
    private LocalDateTime startWork;
    //private Integer id; //idDepartment
    //private Integer id; //idemployeeType


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastNname(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateBorn() {
        return dateBorn;
    }
    public void setDateBorn(LocalDateTime dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }
    public void setStartWork(LocalDateTime startWork) {
        this.startWork = startWork;
    }
}
