package com.onlyxcodes.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyxcodes.app.model.Orders;
import com.onlyxcodes.app.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
@Qualifier("Orders.class")
public class OrderController {
	@Autowired
	private OrderRepository orderrepo;

	// insert  order detaials into database
	@PostMapping("/addorders")
	public Orders addItem(@RequestBody Orders order) {
		return orderrepo.save(order);
	}

	// get single order
	@GetMapping("/order/{id}")
	public Optional<Orders> getsingleOrders(@PathVariable int orderId) {
		return orderrepo.findById(orderId);
	}

	// get BULK orders
	@GetMapping("/bulkorders")
	public List<Orders> getBulkOrders(@PathVariable int itemId) {
		List<Orders> Orders = (List<Orders>) orderrepo.findAll();
		return Orders;
	}

	// GET ALL ORDERS
	@GetMapping("/allorders")
	public List<Orders> getAllOrders() {
		List<Orders> Orders = (List<Orders>) orderrepo.findAll();
		return Orders;
	}

}
