class WatchStarter
{
public static void main(String[] args)
{
	Watch watch=new Watch(463,"Rolex");
	System.out.println(watch.model);
	System.out.println(watch.brand);
	int model=watch.model;
	String brand=watch.brand;
	Light light=watch.light;
	System.out.println(light.on);
}
}