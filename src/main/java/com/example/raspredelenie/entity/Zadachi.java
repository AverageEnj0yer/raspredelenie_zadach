package com.example.raspredelenie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Zadachi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer priorityId;

    private String otdel;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd") private Date date;

    public Zadachi() {
    }

    public Zadachi(Integer id, Integer priorityId, String otdel, String description, Date date) {
        this.id = id;
        this.priorityId = priorityId;
        this.otdel = otdel;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public String getOtdel() {
        return otdel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
