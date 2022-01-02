package com.xworkz.DTO;

public class ArmyDTO {
	
	
	String type;
	float noOfSoldier;
	private Object noOfSoliders;
	
	ArmyDTO()
	{
		
	}

	public ArmyDTO(String type, float noOfSoldier) {
		super();
		this.type = type;
		this.noOfSoldier = noOfSoldier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getNoOfSoldier() {
		return noOfSoldier;
	}

	public void setNoOfSoldier(int noOfSoldier) {
		this.noOfSoldier = noOfSoldier;
	}

	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return" ArmyDTO[type="+type+",noOfSoldier="+noOfSoldier+"]";
	 }
	
		@Override
		public  int hashCode() 
		{
			// TODO Auto-generated method stub
			return 5;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj!=null) {
				if(obj instanceof ArmyDTO) {
					ArmyDTO cast=(ArmyDTO)obj;
					if(this.type.equals(cast.type) && this.noOfSoliders.equals(cast.noOfSoliders)) {
						System.out.println("it is equal");
						return true;
					}
				}
			}
			return false;
	
	 

}
}