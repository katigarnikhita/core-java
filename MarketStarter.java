class MarketStarter
{
public static void main(String[] args)

{
	Market market=new Market();
	market.noOfShops=10;
	market.name="KR MARKET";
	market.city="BIR";
	market.displayDetails();
	
	
	Market market1=new Market();
	market1.noOfShops=20;
	market1.name="Russel Market";
	market1.displayDetails();
}
}