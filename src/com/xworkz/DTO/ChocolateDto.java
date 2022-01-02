package com.xworkz.DTO;

public class ChocolateDto {
	
	private String name;
	private String flavour;
	private int price;
	
	
	 public ChocolateDto()
	 {
		 
	 }


   

	public ChocolateDto(String name, String flavour, int price) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.price = price;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFlavour() {
		return flavour;
	}


	public void setFolvour(String folvour) {
		this.flavour = flavour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return  " ChocolateDto[name=" +name+",flavour=  "+flavour+",price="+price+"]";}
	


@Override
public int hashCode() 
{
	// TODO Auto-generated method stub
	return 2;
}
@Override
public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof ChocolateDto) {
			ChocolateDto cast=(ChocolateDto)obj;
			if(this.name.equals(cast.name) && this.flavour.equals(cast.flavour)) {
				System.out.println("it is equal");
				return true;
			}
		}
	}
	return false;
}
}

	 
	
