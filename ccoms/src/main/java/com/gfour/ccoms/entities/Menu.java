package com.gfour.ccoms.entities;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ItemName")
    private String itemName;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "DiningStation")
    private String diningStation;

    @Column(name = "Portion")
    private String portion;

    @Column(name = "Calories")
    private int calories;

    @Column(name = "Ingredients")
    private String ingredients;

    @Column(name = "isVegan")
    private char isVegan;

    @Column(name = "containsGluten")
    private char containsGluten;

    @Column(name = "containsDairy")
    private char containsDairy;

    @Column(name = "containsNuts")
    private char containsNuts;

    @Column(name = "Protein")
    private BigDecimal protein;

    @Column(name = "TotalCarbohydrates")
    private BigDecimal totalCarbohydrates;

    @Column(name = "Cholesterol")
    private BigDecimal cholesterol;

    @Column(name = "TotalFat")
    private BigDecimal totalFat;

    @Column(name = "Sodium")
    private BigDecimal sodium;

    @Column(name = "Potassium")
    private BigDecimal potassium;

    @Column(name = "Iron")
    private BigDecimal iron;

    @Column(name = "Calcium")
    private BigDecimal calcium;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "DiningHallID")
    private DiningHall diningHall;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedOn")
    private Date createdOn;

    @Column(name = "UpdatedBy")
    private String updatedBy;
}

