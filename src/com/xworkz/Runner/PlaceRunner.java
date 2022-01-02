package com.xworkz.Runner;

import com.xworkz.DAO.Place;

public class PlaceRunner {

	private static Object String;
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Place place=new Place();
		place.save("laxmeshwar");
		place.save("gadag");
		place.save("Banglore");
		place.save("mysore");
		
		boolean findMatchingName=place.findMatchingName("gadag");
         System.out.println(findMatchingName);
         
         
         boolean findMatchingCaseIngore=place.findMatchingCaseiInsenstive=place.findMatchingCaseiInsenstive("laxmeshwar");
         System.out.println(findMatchingCaseIngore);
         
         
         boolean findMatchStartsWith=place.findMatchingCaseiInsenstive=place.findMatchingCaseiInsenstive("laxmeshwar");
         System.out.println(findMatchStartsWith);
         
         Place findMatchStart=place=findMatchStartsWith("war");
         System.out.println(findMatchStart);

		
		
}

	private static Place findMatchStartsWith(java.lang.String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
