package com.gfour.ccoms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gfour.ccoms.entities.OrdersDetails;

public interface OrderDetailsRepo extends CrudRepository<OrdersDetails, Integer> {
}
