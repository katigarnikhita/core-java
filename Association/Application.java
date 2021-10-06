class Application
{
 String name;
 float version;
 CompanyDetails company;
 
 
 Application(String name,float version)
 {
	 this.name=name;
	 this.version=version;
	 
 }
 void DisplayDetails()
 {
	 System.out.println(this.name);
	 System.out.println(this.version);
	 System.out.println(this.company);
	
	 
 }
 
 
 



}