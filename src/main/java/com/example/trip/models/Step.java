package com.example.trip.models;

import org.springframework.data.annotation.Id;

import java.sql.Date;

public class Step {
    @Id
    private String id;
    private Date start;
    private Date end;

    public Step(String id, Date start, Date end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}