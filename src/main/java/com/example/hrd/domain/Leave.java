package com.example.hrd.domain;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;

@Entity
public class Leave {
    public enum LeaveType {VACATION,SICK}
    @Id
    private Integer id;
    private String reasonLeave;
    private LocalDateTime dateLeave;
    private LocalDateTime startDate;
    private LocalDateTime startTime;
    private LocalDateTime endDate;
    private LocalDateTime endTime;
    private float totalDateLeave;
    private File fileLeave;
    private String statusLeave;
    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    //employee_id
    @ManyToOne
    private Employee employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonLeave() {
        return reasonLeave;
    }

    public void setReasonLeave(String reasonLeave) {
        this.reasonLeave = reasonLeave;
    }

    public LocalDateTime getDateLeave() {
        return dateLeave;
    }

    public void setDateLeave(LocalDateTime dateLeave) {
        this.dateLeave = dateLeave;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public float getTotalDateLeave() {
        return totalDateLeave;
    }

    public void setTotalDateLeave(float totalDateLeave) {
        this.totalDateLeave = totalDateLeave;
    }

    public File getFileLeave() {
        return fileLeave;
    }

    public void setFileLeave(File fileLeave) {
        this.fileLeave = fileLeave;
    }

    public String getStatusLeave() {
        return statusLeave;
    }

    public void setStatusLeave(String statusLeave) {
        this.statusLeave = statusLeave;
    }
}
