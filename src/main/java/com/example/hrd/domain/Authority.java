package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authority {
    @Id
    private Integer id;
    private String name;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameAuthorrity) {
        this.name = nameAuthorrity;
    }
}
