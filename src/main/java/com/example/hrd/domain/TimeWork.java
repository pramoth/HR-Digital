package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class TimeWork {
    @Id
    private Integer id;
    private LocalDateTime workDate;
    private LocalDateTime noWorkDate;
    private LocalDateTime timeCome;
    private LocalDateTime timeOut;
    //private Integer id; //id FK from table Employee


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDateTime workDate) {
        this.workDate = workDate;
    }

    public LocalDateTime getNoWorkDate() {
        return noWorkDate;
    }

    public void setNoWorkDate(LocalDateTime noWorkDate) {
        this.noWorkDate = noWorkDate;
    }

    public LocalDateTime getTimeCome() {
        return timeCome;
    }

    public void setTimeCome(LocalDateTime timeCome) {
        this.timeCome = timeCome;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }
}
