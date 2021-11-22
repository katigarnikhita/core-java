package com.xworks.bridge;

public class HospitalAssociation implements HospitalAdmitRule, HospitalDischarge{
	
	
	private String name;
	private String location;
	private String govt;
	private boolean  hosptallAdmitRule;
	private String functionnality;
	private Object HospitalAdmitRule;
	
	public HospitalAssociation()
	{
		
	}
	
	

	public HospitalAssociation(String name, String location, String govt, boolean hosptallAdmitRule,
			String functionnality) {
		super();
		this.name = name;
		this.location = location;
		this.govt = govt;
		this.hosptallAdmitRule = hosptallAdmitRule;
		this.functionnality = functionnality;
	}

	
	

	public void admitPatient()
	{
		System.out.println("invoking method");
		
			return;
	
	 
		//System.out.println("null");
		
	}
	
	
	public double validInsurance() {
		System.out.println("invoking insurance");
		
		return 12;
	}

	@Override
	public String register() {
		System.out.println("patient details are Registered");
		return "details";
	}

	@Override
	public double payAdvance() {
		System.out.println("invoking hospital payAdvance ");
		
		return 5000;
	}

	@Override
	public boolean insurance() {
		System.out.println("invoking hospital insurance ");
		return true;
	}



	@Override
	public boolean payBill() {
		// TODO Auto-generated method stub
		return false;
	}

}
