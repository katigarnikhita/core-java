package com.xworkz.DTO;

public class HospitalDTO {
	
	private String name;
	private String location;
	
	public HospitalDTO()
	{
		
	}

	public HospitalDTO(String name, String location) {
		super();
		this.name = name;
		this.location = location;
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
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "HospitalDTO[name=" + name + ", location="+ location + "]";
	}
				
		@Override
		public int hashCode() 
		{
			// TODO Auto-generated method stub
			return 5;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj!=null) {
				if(obj instanceof HospitalDTO) {
					HospitalDTO cast=(HospitalDTO)obj;
					if(this.name.equals(cast.name) && this.location.equals(cast.location)) {
						System.out.println("it is equal");
						return true;
					}
				}
			}
			return false;
		}
		
		
	}
		
		
		
		
				
				
				


