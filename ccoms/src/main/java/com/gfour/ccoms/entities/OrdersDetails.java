package com.gfour.ccoms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OrdersDetails")
public class OrdersDetails {
    @Id
    @ManyToOne
    @JoinColumn(name = "OrdersID")
    private Orders orders;

    @Id
    @ManyToOne
    @JoinColumn(name = "MenuID")
    private Menu menu;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Price")
    private Double price;

}
