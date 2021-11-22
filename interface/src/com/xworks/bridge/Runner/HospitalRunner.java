package com.xworks.bridge.Runner;

import com.xworks.bridge.HospitalAdmitRule;
import com.xworks.bridge.HospitalAssociation;
import com.xworks.bridge.HospitalDischarge;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HospitalAdmitRule  ref=new HospitalAssociation();
		String register=ref.register();
		System.out.println("registered");
		
		double payAdvance=ref.payAdvance();
		System.out.println(5000);
		
		
		boolean validInsurance=ref.insurance();
		
		System.out.println(1);
		
		
		HospitalDischarge ref2=new HospitalAssociation ();
		boolean payBill=ref2.payBill();
		System.out.println(10000);
		
		double validInsurance1=ref2.validInsurance();
		System.out.println("valid");
		
		
		
		
		
		
		
	}

}
