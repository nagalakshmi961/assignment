package com.onlyxcodes.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlyxcodes.app.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer>{

}
