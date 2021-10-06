class CurrencyRunner
{
public static void main(String[] args)
{
	Currency ref=new Currency("dollor");
    ref.DisplayDetails();
	ref=new Currency("Rupes");
	ref.value=3.05f;
	System.out.println(ref);
	ref.DisplayDetails();
	
	
	Application application=new Application("aa",11.2f);
	application.DisplayDetails();
	
	application.company=new CompanyDetails("bb","cc","dd");
	CompanyDetails company=application.company;
	company.DisplayDetails();
	
	
	
	
}
}
	
	
	
	
	
	
