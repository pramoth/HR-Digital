package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveMaxSetting {
    @Id
    private Integer id;
    private Integer year;
    private Integer leaveMax;
    //EMPLOYEE_TYPE_ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLeaveMax() {
        return leaveMax;
    }

    public void setLeaveMax(Integer leaveMax) {
        this.leaveMax = leaveMax;
    }
}
