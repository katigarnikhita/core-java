class TicketRunner
{
public static void main(String[] args)
{
TicketPrice tp=TicketPrice.GANDHI;
System.out.println("Gandi ="+tp.price);


TicketPrice btr=TicketPrice.BALCONY;
System.out.println(btr.price);
System.out.println(btr.tax);


System.out.println(TicketPrice.BOX.tax + TicketPrice.BOX.price);
TicketPrice[] ticketPriceValue=TicketPrice.value();
for(int size=0;size=0;size<ticketPriceValue.lenght;)
{
	TicketPrice temp=ticketPriceValue[size];
	System.out.println(temp);
	size++;
}



 }
}