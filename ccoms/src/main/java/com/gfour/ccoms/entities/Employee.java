package com.gfour.ccoms.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "DiningHallID")
    private DiningHall diningHall;

    @Column(name = "DiningStation")
    private String diningStation;

    @Column(name = "Role")
    private String role;

    @Column(name = "EmailID")
    private String emailID;

    @Column(name = "Password")
    private String password;

    @Column(name = "PhoneNum")
    private String phoneNum;

    @Column(name = "AptNo")
    private String aptNo;

    @Column(name = "Street")
    private String street;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "ZipCode")
    private String zipCode;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedOn")
    private Date createdOn;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @OneToMany(mappedBy = "employee")
    private List<Orders> orders;

    // Constructors, getters, and setters
}
