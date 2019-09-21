package com.ustglobal.HotelBilling.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_bill")
public class Hotel {
	@Id
	@Column
	private int item_code;
	@Column(name = "Food_Name")
	private String food_name;
	@Column(name = "Price")
	private double price;
	@Override
	public String toString() {
		return "Hotel [item_code=" + item_code + ", food_name=" + food_name + ", price=" + price + "]";
	}
	public int getItem_code() {
		return item_code;
	}
	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
