package com.onlyxcodes.app.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyxcodes.app.model.items;
import com.onlyxcodes.app.repository.ItemsRepository;

@RestController
@RequestMapping("/items")
@Qualifier("items.class")
public class ItemsController {

	@Autowired
	ItemsRepository itemrepository;

	// retrieve all item from database

	@GetMapping("/all")
	public List<items> getAllItems() {
		List<items> items = (List<items>) itemrepository.findAll();
		return items;
	}

	// insert new item into database
	@PostMapping("/add")
	public items addItem(@RequestBody items item) {
		return itemrepository.save(item);
	}

	// get particular item by their ID

	@GetMapping("/items/{id}")
	public Optional<items> getItemId(@PathVariable int id) {
		return itemrepository.findById(id);
	}

	// update existing item

	@PutMapping("/update/{id}")
	public items updateItem(@RequestBody items item) {
		return itemrepository.save(item);
	}

	// delete particular item from database

	@DeleteMapping("/delete/{id}")
	public void deleteItem(@PathVariable int id) {
		itemrepository.deleteById(id);
	}

}
