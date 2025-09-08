package model.dao;

import java.util.List;

import application.Seller;

public interface SellerDao {
	
	
	void insert(Seller obj);
	void update(Seller obj);
	void delete(Seller obj);
	Seller findById(Integer id);
	List<Seller> findAll();

}
