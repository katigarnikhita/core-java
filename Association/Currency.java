class Currency
{
    String name;
    CountryDetails country;
	float value=4.0f;
	
	
	
	Currency(String name)
	{
		this.name=name;
		this.value=value;
	}
	
	
	void DisplayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.value);
	}
}