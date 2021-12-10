package com.xworkz.DTO;

public class officeDTO {
	
	
    private String name;
    private String location;
    private int noOfStaffs;
	private Object cast;
     
    
    public officeDTO()
    {
    	
    }


	public officeDTO(String name, String location, int noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.noOfStaffs = noOfStaffs;
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


	public int getNoOfStaffs() {
		return noOfStaffs;
	}


	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "officeDTO[name="+name+",location="+location+",noOfStaffs="+noOfStaffs+"]";
    }
     @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return 40;
    }
     @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	if(obj!=null)
    			{
    		   if(obj instanceof officeDTO)
    		   {
    			   
    			   if(this.name.equals(cast.name) && this.location.equals(cast.location))
   					System.out.println("it is equal");
   					return true;
    		   }
    			   
    			   
    			   return false;
    			}
    }
    

}



