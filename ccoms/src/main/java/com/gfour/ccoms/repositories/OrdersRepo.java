package com.gfour.ccoms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gfour.ccoms.entities.Orders;

public interface OrdersRepo extends CrudRepository<Orders, Integer> {
}
