package com.xworks.bridge.Runner;

import com.xworks.bridge.ArrayAmazonCartDAO;
import com.xworks.bridge.CartDTO;

public class AmazonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				CartDTO cartDTOs1 = new CartDTO("MI", "good", 18000.0f,4);
				ArrayAmazonCartDAO dto1 = new ArrayAmazonCartDAO();
				dto1.saveCart(cartDTOs1);

				dto1.saveCart(new CartDTO("VIO","bad",10000.0f,3), 3);

				CartDTO ref = dto1.findByName("MI");
				System.out.println(ref);
				
				ArrayAmazonCartDAO arrayAmazonCartDAO=new ArrayAmazonCartDAO();
				System.out.println(arrayAmazonCartDAO.save(cartDTOs1));
				System.out.println(arrayAmazonCartDAO.findByName("mi"));
				arrayAmazonCartDAO.displayAllCartDetails();
				
			}

		


	}

