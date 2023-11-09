package com.gfour.ccoms.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class StudentDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String globalID;
    private String password;
    private String phoneNum;
    private Double flexAmountBalance;
    private String aptNo;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
}
