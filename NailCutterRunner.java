class NailCutterRunner
{
  public static void main(String[] args)
  {
	  NailCutter ref=new NailCutter();
	  ref.type="xyz";
	  ref.price=50;
	  ref.size=NailCutterSize.SMALL;
	  ref.modelNumber=20;
	  ref.color="black";
      ref.nailcutting();
	  
	  
	  
	  NailCutter ref1=new NailCutter();
	  ref1.type="abc";
	  ref1.price=30;
	  ref1.size=NailCutterSize.BIG;
	  ref1.modelNumber=40;
	  ref1.color="GREEN";
	  ref1.nailcutting();
	  
	  
	  
	  
	   
	  NailCutter ref2=new NailCutter();
	  ref2.type="JSGF";
	  ref2.price=90;
	  ref2.size=NailCutterSize.MEDIUM;
	  ref2.modelNumber=50;
	  ref2.color="sliver";
	  ref2.polishing();
	  
  }
  
}





