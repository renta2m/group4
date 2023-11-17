package com.gfour.ccoms.services;

import com.gfour.ccoms.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfour.ccoms.repositories.OrdersRepo;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrdersRepo ordersRepo;
    
    public void updateOrderStatus(Integer id, String status) {
        Optional<Orders> order = ordersRepo.findById(id);

        if (order.isPresent()) {
            Orders orders = order.get();
            orders.setOrdersStatus(status);
            ordersRepo.save(orders);
        }
    }
}