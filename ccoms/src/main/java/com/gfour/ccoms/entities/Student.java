package com.gfour.ccoms.entities;
;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "GlobalID")
    private String globalID;

    @Column(name = "Password")
    private String password;

    @Column(name = "PhoneNum")
    private String phoneNum;

    @Column(name = "FLEX_Amount_Balance")
    private Double flexAmountBalance;

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

    @OneToMany(mappedBy = "student")
    private List<Orders> orders;

}
