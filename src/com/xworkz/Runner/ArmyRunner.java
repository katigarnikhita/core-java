package com.xworkz.Runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.DTO.ArmyDTO;
import com.xworkz.DTO.ChocolateDto;

public class ArmyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArmyDTO armyDto=new ArmyDTO("indianarmy",1000);
		ArmyDTO armyDto1=new ArmyDTO("indian navy",12345);
		ArmyDTO armyDto2=new ArmyDTO("indian air Force",1245678);
		
		Set<ArmyDTO> set=new HashSet<ArmyDTO>();
		set.add(armyDto);
		set.add(armyDto1);
		set.add(armyDto1);
		
		System.out.println(set.size());
		Iterator<ArmyDTO> iterator=set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}


	}

}
