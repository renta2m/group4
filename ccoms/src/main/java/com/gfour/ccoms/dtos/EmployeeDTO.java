package com.gfour.ccoms.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO {
    private int id;
    private String firstName;
    private String lastName;
    private int diningHallID;
    private String diningStation;
    private String role;
    private String emailID;
    private String password;
    private String phoneNum;
    private String aptNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
}
