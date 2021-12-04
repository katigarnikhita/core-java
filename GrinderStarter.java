class GrinderStarter
{
public static void main(String[] args)
{

Grinder ref=new Grinder(1,"Grinder company");

System.out.println(ref.capacity);
System.out.println(ref.company);
int capacity=ref.capacity;
	String company=ref.company;
	Motor motor=ref.motor;
	System.out.println(motor.model);
    System.out.println(motor.rpm);


}
}