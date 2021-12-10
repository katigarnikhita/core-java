package com.xworkz.Runner;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.DTO.PoliceStationDTO;

public class PoliceStationRunner  {
	
	public static void main(String[] args)
	{
		PoliceStationDTO Policesationdto=new PoliceStationDTO("aa"," banglore", 34);
		PoliceStationDTO Policesationdto1=new PoliceStationDTO("aaa"," hubli", 44);
		PoliceStationDTO Policesationdto2=new PoliceStationDTO("aca"," mysore", 54);
		
		
		
		
	
	Set<PoliceStationDTO> set=new HashSet<PoliceStationDTO>();
	set.add(Policesationdto);
	set.add(Policesationdto2);
	set.add(Policesationdto1);
	
	System.out.println(set.size());
	Iterator<PoliceStationDTO> iterator=set.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}

	
	

}
}
