package com.xworks.bridge.Runner;
import com.xworks.bridge.*;
import com.xworks.bridge.constant.Address;

public class CitizenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 VotingRule ref = new IndianCitizen();
		 int age=ref.validAge();
		 System.out.println(age);
		
		
		 String validId=ref.validId();
		 System.out.println(validId);
		 
		 TrafficRule ref1=new IndianCitizen();
		 
		 boolean validLicence=ref1.validLicence();
		 String licenseNo=ref1.licenseNo();
		 boolean validInsurance=ref1.validInsurance();
		 
		 
		 IndianCitizen city=new IndianCitizen();
			int ageValid=city.validAge();
			
			
			 IndianCitizen city1=new IndianCitizen();
			 city1.displayNameAndDetails("madhu", Address.Banglore);
		 
		
	}

}


