class Train
{

void Transport()
{
System.out.println("invoked tranport");
System.out.println("Transport");
this.start();
}
static void start()
{
	System.out.println("invoked start");
	System.out.println("tranport");
	stop();
}
static void stop()
{
	System.out.println("invoked stop");
}
}
