class SaloonRunner
{
public static void main(String[] args)
{
	Saloon saloon=new Saloon();
	saloon.name="Green Trends";
	saloon.location="BTM";
	saloon.openTime=9.0f;
	saloon.closeTime=9.0f;
	saloon.branch=SaloonBranch.BTM;
	
	
	Saloon saloon1=new Saloon();
	saloon.name="YLG";
	saloon.location="JAYANAGAR";
	saloon.openTime=9.0f;
	saloon.closeTime=8.0f;
	saloon.branch=SaloonBranch.JAYANAGAR;
	
	
	
	saloon.haircut();
	saloon1.haircut();
	}
}