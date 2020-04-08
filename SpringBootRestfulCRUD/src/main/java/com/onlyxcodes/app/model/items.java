package com.onlyxcodes.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class items implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int item_id;
	private String item_name;
	private String item_description;
	private Double price;
	private Double available_stock;
	
	@OneToMany
	private List<Orders> orders;
	
	public items() {
		super();

	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getAvailable_stock() {
		return available_stock;
	}

	public void setAvailable_stock(Double available_stock) {
		this.available_stock = available_stock;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((available_stock == null) ? 0 : available_stock.hashCode());
		result = prime * result + ((item_description == null) ? 0 : item_description.hashCode());
		result = prime * result + item_id;
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		items other = (items) obj;
		if (available_stock == null) {
			if (other.available_stock != null)
				return false;
		} else if (!available_stock.equals(other.available_stock))
			return false;
		if (item_description == null) {
			if (other.item_description != null)
				return false;
		} else if (!item_description.equals(other.item_description))
			return false;
		if (item_id != other.item_id)
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	

	
}
