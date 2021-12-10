package com.xworkz.Runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.DTO.PoliceStationDTO;
import com.xworkz.DTO.officeDTO;

public class officeDTORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		officeDTO officedto=new officeDTO("infinit office","hubli",45);
		officeDTO officedto1=new officeDTO("solid office","Banglore",35);
		officeDTO officedto2=new officeDTO("service office","mysore",35);
		
		Set<officeDTO> set=new HashSet<officeDTO>();
		set.add(officedto);
		set.add(officedto2);
		set.add(officedto1);
		
		System.out.println(set.size());
		Iterator<officeDTO> iterator=set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
