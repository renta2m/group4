package com.gfour.ccoms.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gfour.ccoms.dtos.OrdersDTO;
import com.gfour.ccoms.entities.Menu;
import com.gfour.ccoms.entities.Orders;
import com.gfour.ccoms.repositories.MenuRepo;
import com.gfour.ccoms.repositories.OrdersRepo;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrdersRepo ordersRepo;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("/all")
    public List<OrdersDTO> getAll() {
        Iterable<Orders>  menuItems = ordersRepo.findAll();
        List<OrdersDTO> ordersList = new ArrayList<>();
        menuItems.forEach(item -> {
            ordersList.add(modelMapper.map(item, OrdersDTO.class));
        });

        return ordersList;
    }
}
