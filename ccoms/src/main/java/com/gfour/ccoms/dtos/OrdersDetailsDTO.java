package com.gfour.ccoms.dtos;

import lombok.Data;

@Data
public class OrdersDetailsDTO {
    private int ordersID;
    private int menuID;
    private int quantity;
    private Double price;
}
