package com.xworks.bridge;

public interface AmazonCartDAO {
	
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	 void displayAllCartDetails();



}
