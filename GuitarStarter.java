class GuitarStarter
{
public static void main(String[] args)
{
	Guitar guitar=new Guitar(5000.0f);
	guitar.brand="yamaha";
	guitar.noOfStrings=6;
	guitar.cost=7000.0f;
	
	
	
	Guitar guitar1=new Guitar(5000.0f);
	System.out.println(guitar1.brand);
	guitar1.brand="Casio";
	guitar1.noOfStrings=4;
	guitar1.cost=999.0f;
	
	
	System.out.println(guitar.brand);
	
	
}
	
	
}