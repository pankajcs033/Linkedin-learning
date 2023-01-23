package com.oracle.roomwebapp.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    private String GUID;
    @Column(name="FIRST_NAME")
    private String fname;
    @Column(name="LAST_NAME")
    private String lname;
    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.GUID = UUID.randomUUID().toString();
    }

    public StaffMember(String GUID, String fname, String lname, Position position) {
        this.GUID = GUID;
        this.fname = fname;
        this.lname = lname;
        this.position = position;
    }
    
    public String getGUID() {
        return GUID;
    }
    public void setGUID(String gUID) {
        GUID = gUID;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
}
