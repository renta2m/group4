package com.gfour.ccoms.controllers;

import java.util.ArrayList;
import java.util.List;

import com.gfour.ccoms.services.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private OrderService orderService;
    @GetMapping("/all")
    public List<OrdersDTO> getAll() {
        Iterable<Orders>  menuItems = ordersRepo.findAll();
        List<OrdersDTO> ordersList = new ArrayList<>();
        menuItems.forEach(item -> {
            ordersList.add(modelMapper.map(item, OrdersDTO.class));
        });

        return ordersList;
    }

    @PostMapping("update-status/{id}/{status}")
    public void updateOrderStatus(@PathVariable Integer id, @PathVariable String status) {
        orderService.updateOrderStatus(id, status);
    }
}
