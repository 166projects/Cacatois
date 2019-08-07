package com.mphasis.car.dao;

import java.util.List;

import com.mphasis.car.entities.Booking;
import com.mphasis.car.entities.Driver;
import com.mphasis.car.entities.User;

public interface AdminDao {
	public void editadmindetails(User users);
	public List<User> getallusers();
	public List<Driver> getalldrivers();
	public List<Booking> getbookingsbyid(int uid);
	public void deleteadmin(int cid);
}
