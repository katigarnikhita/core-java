package com.xworkz.Runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.DTO.ChocolateDto;
import com.xworkz.DTO.PoliceStationDTO;

public class ChocolateDtoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChocolateDto chocolate=new ChocolateDto("kitkat","aa",30);
	    ChocolateDto chocolate2=new ChocolateDto("dairymilk","xx",56);
	    ChocolateDto chocolate1=new ChocolateDto("perk","yy",10);
				
				
		Set<ChocolateDto> set=new HashSet<ChocolateDto>();
		set.add(chocolate);
		set.add(chocolate2);
		set.add(chocolate1);
		
		System.out.println(set.size());
		Iterator<ChocolateDto> iterator=set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
