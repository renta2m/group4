package com.gfour.ccoms.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class MenuDTO {
    private int id;
    private String itemName;
    private Double price;
    private String diningStation;
    private String portion;
    private int calories;
    private String ingredients;
    private char isVegan;
    private char containsGluten;
    private char containsDairy;
    private char containsNuts;
    private Double protein;
    private Double totalCarbohydrates;
    private Double cholesterol;
    private Double totalFat;
    private Double sodium;
    private Double potassium;
    private Double iron;
    private Double calcium;
    private int diningHallID;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
}
