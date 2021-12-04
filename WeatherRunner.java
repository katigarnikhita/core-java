class WeatherRunner
{
public static void main(String[] args)
{
	Weather ref=new Weather(11);
	ref.Seasion="Rainy";
	ref.temp=30.1f;
	ref.time=10;
	
	ref.humidity="cloudy";
	
	
	
	Weather ref1=new Weather(12);
	System.out.println(ref1.time);
	ref1.Seasion="sunny";
	ref1.temp=0.1f;
	ref1.time=5;
	
	ref.humidity="cloudy";
	
	
	
	
	System.out.println(ref.time);
}
}


