package com.xworkz.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.DTO.ArmyDTO;

public class Place implements Serializable
{
	
	private Collection<String>places=new ArrayList<String>();
	public boolean findMatchingCaseiInsenstive;
	
	public boolean save(String name)
	
	{
		return this.places.add(name);
			
	}

	public boolean findMatchingName(String place) {
		// TODO Auto-generated method stub
		
		
		if(place!=null)
		{
			if(places.contains(place))
			{
				System.out.println("place is found");
				return true;
			}
		}
		return false;
	}
	
	public boolean findMatchingCaseiInsenstive(String place)
	
	{
		if(place!=null)
		{
			Iterator<String>itr=places.iterator();
			while(itr.hasNext())
			{
				String value=itr.next();
				if(value.equalsIgnoreCase(place))
				{
					System.out.println("place is found igonoring the cases");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
public boolean findMatchStartsWith(String chars)
	
	{
		if(chars!=null)
		{
			Iterator<String>itr=places.iterator();
			while(itr.hasNext())
			{
				String val1=itr.next();
				if(val1.toUpperCase().startsWith(chars.toUpperCase()))
				{
					System.out.println("place is found igonoring the cases");
					return true;
				}
			}
		}
		return false;
	}

public boolean findMatchEndsWith(String chars)

{
	if(chars!=null)
	{
		Iterator<String>itr=places.iterator();
		while(itr.hasNext())
		{
			String val1=itr.next();
			if(val1.toUpperCase().endsWith(chars.toUpperCase()))
			{
				System.out.println("place is found  which ends with same chars");
				return true;
			}
		}
	}
	return false;
}
}


	


	

	
	

	
	
	


