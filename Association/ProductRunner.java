class ProductRunner
{
public static void main(String[] args)
{
	Product ref=new Product("Hair Dryer","EC",19000.2,"Philips");
	ref.productDetails();
	ref.printTotalCost();
	
	
	
	Product ref1=new Product("Trimer","EC",200,4,"Nova");
	ref1.printTotalCost();
	
	
	Product.printTotalProductPrice();
	}
}