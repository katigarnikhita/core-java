package com.xworks.bridge;
import com.xworks.bridge.*;

public class TempleAssociation implements DevoteRule{
	
	private String AssociationName;
	private boolean SlipperOff ;
	private String name;
	private DevoteRule devolet;
	 
	public TempleAssociation()
	{
		System.out.println("invoking TempleAsscoiation");
		
	}

	public TempleAssociation(String name, DevoteRule devolet) {
		super();
		this.name = name;
		this.devolet = devolet;
	}
	
	public void allowedDevoteRule()
	{
		System.out.println("Temple Name:"+AssociationName);
		if(devolet!=null) {
		System.out.println("invoking allowedDevoteRule".concat(name));
		
		
		
			if(SlipperOff)
			{
			System.out.println("invoking DevoteRule ");
			System.out.println("**");
			
			boolean SlipperOff1=this.devolet.dontTakePhoto();
			boolean maintaneslilence=this.devolet.maintaneslilence();
			if(SlipperOff1 && maintaneslilence)
			{
				System.out.println("photos taking".concat(name));
				
			}
			else
			{
				System.err.println("outside");
			}
		}
		
		else
		{
			System.out.println("outside");
		}
	}
	
	
	
	}

	@Override
	public boolean SlipperOff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dontTakePhoto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean maintaneslilence() {
		// TODO Auto-generated method stub
		return false;
	}

}
