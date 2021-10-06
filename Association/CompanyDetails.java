class CompanyDetails
{
  String name;
  CountryDetails country;
  String CEO;
  String CFO;
  CompanyDetails(String name,String CEO,String CFO)
  {
   this.name=name;
   this.CEO=CEO;
   this.CFO=CFO;
  }
  
  
  
  void DisplayDetails()
  {
	  System.out.println(this.name);
	  System.out.println(this.country);
	  System.out.println(this.CEO);
	  System.out.println(this.CFO);
}
}
