class Product
{
String name;
int Quantity;
float prize;
String type;
String vendor;


	Product(String name,int Quality,float prize,String type,String vendor)
	{
		this.name=name;
		this.Quanlity=Quanlity;
		this.prize=prize;
		this.type=type;
		this.vendor=vendor;
		System.out.println("invoked 5 parameters const");
		
	}
	
	Product(String name,float price,int quanlity)
	{
		this.name=name;
		this.price=price;
		System.out.println("invoked 3 parameters const");
	}
	
	void ProductDetails()
	{
		System.out.println("dispaymethod is invoked");
		System.out.println(this.name);
		System.out.println(this.Quality);
		System.out.println(this.prize);
		System.out.println(this.type);
		System.out.println(this.vendor);
		
	}
	void printTotalCost()
	{
		float total=this.price*this.quanlity;
		System.out.println("TOTAL COST:"+total);
		totalProductsPrice=totalProductPrice+total;
		System.out.println("total Product Price:"+totalProductPrice);
	}
	
	
	static void printProductPrice
	{
		System.out.println("Total Product Price:"+totalProductPrice);
	}
}


