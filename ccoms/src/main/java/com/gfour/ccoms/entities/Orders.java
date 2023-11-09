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
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "StudentID")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "EmployeeID")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "DiningHallID")
    private DiningHall diningHall;

    @Column(name = "TotalAmount")
    private Double totalAmount;

    @Column(name = "OrdersStatus")
    private String ordersStatus;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedOn")
    private Date createdOn;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @OneToMany(mappedBy = "orders")
    private List<OrdersDetails> orderDetails;

}
