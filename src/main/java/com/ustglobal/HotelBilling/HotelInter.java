package com.ustglobal.HotelBilling;

import java.util.List;

import com.ustglobal.HotelBilling.dto.Hotel;

public interface HotelInter {

	public boolean insert();

	public boolean update();

	public boolean deleteData();

	public List<Hotel> getAllData();

	public void bill();

	public Hotel addFood();

}
