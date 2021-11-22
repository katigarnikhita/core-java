package com.xworks.bridge;

public class Library implements LibraryRule  {
	
	
	private LibraryRule library;
	private  String name;
	
	
	public Library ()
	{
	
		System.out.println("invoking the Library no-args function");
		
	}


	public Library(LibraryRule library, String name) {
		super();
		this.library = library;
		this.name = name;
	}
public void lending(int returntime)
{
	System.out.println("invoking lending method");
	if(this.library!=null)
	{
		System.out.println("invoking the Library rules");
	
	}
	String identityCard=this.library.identityCard();
	if(identityCard != null) {
		boolean intime=this.library.intime();
		boolean retrunTime=this.library.retrunTime();
		System.out.println("invoking the Library intime rules");
	
			
		
		
			{
		
			
		System.out.println("invoking returnTime rules");
	}
		System.out.println("rules break");
		
	}
	else
	{
		System.out.println("invoking breaking rile finee");
	}
			Object intime;
			if(intime=0 && returntime<0)
			{
				System.out.println("intime");
				System.out.println("returntime");
			}
				
	}


@Override
public String identityCard() {
	
	System.out.println("invoking identity card");
	// TODO Auto-generated method stub
	return "anu";
}


@Override
public boolean intime() {
	// TODO Auto-generated method stub
	
	System.out.println("invoking library rule intime");
	return false;
}


@Override
public boolean retrunTime() {
	// TODO Auto-generated method stub
	System.out.println("invoking library returnTime");
	return false;
}

}
