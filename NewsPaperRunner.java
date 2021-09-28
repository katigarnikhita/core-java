class NewsPaperRunner
{
public static void main(String[] args)
{
	
	String name="aaaa";
	String ownerName="bbbbbb";
	LangType langType=KANNADA;
	
NewsPaper ref=new NewsPaper(name,ownerName,langType);
System.out.println("name of newspaper is"+ref.name);
System.out.println("Ownername is"+ref.ownerName);
System.out.println("name of newspaper is"+ref.langType);
}
}