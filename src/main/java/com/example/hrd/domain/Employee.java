package com.example.hrd.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Employee {
    public enum Position{STAFF,HEAD}
    @Id private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDateTime dateBorn;
    private String address;
    private String tel;
    @Enumerated(EnumType.STRING)
    private Position position;
    private LocalDateTime startWork;
    private String username;
    private String password;
    //private Integer id; //idDepartment
    //private Integer id; //idemployeeType
    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Leave> leaves;

    @OneToMany(mappedBy = "employee")
    private List<TimeWork> timeWorks;

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

    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }
    public void setStartWork(LocalDateTime startWork) {
        this.startWork = startWork;
    }
}
