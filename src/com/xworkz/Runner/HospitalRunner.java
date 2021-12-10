package com.xworkz.Runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.DTO.HospitalDTO;
import com.xworkz.DTO.PoliceStationDTO;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HospitalDTO hospitaldto=new HospitalDTO("Lifecare","hubli");
		HospitalDTO hospitaldto1=new HospitalDTO("vivekananda","gadag");
		HospitalDTO hospitaldto2=new HospitalDTO("apollo","laxmeshwar");
		HospitalDTO hospitaldto3=new HospitalDTO("Fortis","haveri");
		
		
		
		Set<HospitalDTO> set=new HashSet<HospitalDTO>();
		set.add(hospitaldto1);
		set.add(hospitaldto3);
		set.add(hospitaldto);
		set.add(hospitaldto2);
		
		System.out.println(set.size());
		Iterator<HospitalDTO> iterator=set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		

	}

}
