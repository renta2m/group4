package com.gfour.ccoms.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "DiningHall")
public class DiningHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DiningHallName")
    private String diningHallName;

    @Column(name = "Timings")
    private String timings;

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

    @Column(name = "CreatedOn")
    private Date createdOn;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "UpdatedOn")
    private Date updatedOn;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @OneToMany(mappedBy = "diningHall")
    private List<Employee> employees;

    @JsonManagedReference
    @OneToMany(mappedBy = "diningHall")
    private List<Menu> menuItems;

    @OneToMany(mappedBy = "diningHall")
    private List<Orders> orders;
}
