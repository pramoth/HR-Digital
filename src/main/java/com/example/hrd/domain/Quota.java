package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quota {
    @Id
    private Integer id;
    private Integer quotaAmount;

    /*FK
    private Integer id; //id_employee
    private Integer id; //id_leave_type
    private Integer id; //id_leave ไม่แน่ใจว่าต้องเอามาเชื่อมไหม
    private Integer id; //id_employee_type ไม่แน่ใจว่าต้องเอามาเชื่อมไหม
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(Integer quotaAmount) {
        this.quotaAmount = quotaAmount;
    }
}
