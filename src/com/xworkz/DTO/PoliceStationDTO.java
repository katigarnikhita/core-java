package com.xworkz.DTO;
public class PoliceStationDTO {
	
	
	private String name;
	private String location;
	private int NoOfStaff;
	
	public void PoliceStationDTO()
	{
		
	}

	public PoliceStationDTO(String name, String location, int noOfStaff) {
		super();
		this.name = name;
		this.location = location;
		NoOfStaff = noOfStaff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfStaff() {
		return NoOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		NoOfStaff = noOfStaff;
	}

	public static char[] size() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PoliceStationDTO[name=" + name + ",location="+ location +", NoOfStaff="+ NoOfStaff +"]";
	}
			
		
		
		
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 45;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	
	if(obj instanceof PoliceStationDTO)
	{
		PoliceStationDTO cast=(PoliceStationDTO)obj;
		if(this.name.equals(cast.name) && this.location.equals(cast.location)) {
			System.out.println("it is equal");
			return true;
	}
	

if(obj!=null) {
	if(obj instanceof PoliceStationDTO) {
		PoliceStationDTO cast1=(PoliceStationDTO)obj;
		if(this.name.equals(cast1.name) && this.location.equals(cast1.location)) {
			System.out.println("it is equal");
			return true;
		}
	}
}
	}
	return false;
}
}
 



    

	
	

