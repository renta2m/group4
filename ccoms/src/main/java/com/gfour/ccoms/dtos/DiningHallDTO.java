package com.gfour.ccoms.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class DiningHallDTO {
    private int id;
    private String diningHallName;
    private String timings;
    private String aptNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private Date createdOn;
    private String createdBy;
    private Date updatedOn;
    private String updatedBy;
}
