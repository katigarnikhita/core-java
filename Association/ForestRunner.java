class ForestRunner
{
public static void main(String[] args)
{
boolean reserved=true;
 Forest ref=new Forest("karnataka","abc",reserved);
System.out.println(ref.name);
System.out.println(ref.location);
System.out.println(ref.reserved);
System.out.println(ref.state);

ref.state=new State("abc","xyz",9);
System.out.println(ref.state);
System.out.println(ref);
System.out.println(ref.state.name);
System.out.println(ref.state.cmName);
System.out.println(ref.state.noOfDistricts);


ref.state.capitalcity=new CapitalCity(1110);
System.out.println(ref.state.capitalcity);
System.out.println(ref);
ref.state.capitalcity.name="banglore";
ref.state.capitalcity.famousFor="IT";
System.out.println(ref.state.capitalcity.name);
System.out.println(ref.state.capitalcity.population);
System.out.println(ref.state.capitalcity.famousFor);






}

}