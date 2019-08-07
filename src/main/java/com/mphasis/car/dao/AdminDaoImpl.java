package com.mphasis.car.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.car.entities.Booking;
import com.mphasis.car.entities.Driver;
import com.mphasis.car.entities.User;
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	SessionFactory sessionFactory;
	public void editadmindetails(User users) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(users);
		tr.commit();
	}

	public List<User> getallusers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Driver> getalldrivers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getbookingsbyid(int uid) {
		// TODO Auto-generated method stub
		return null;
	}
		
	

}
