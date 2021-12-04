class HelmentRunner
{
public static void main(String[] args)
{
Helmet ref=new Helmet();
ref.type="aaa";
ref.size=HelmetSize.BIG;
ref.idealFor="men";
ref.color="black";
ref.safe();





Helmet ref1=new Helmet();
ref1.type="bbb";
ref1.size=HelmetSize.MEDIUM;
ref1.idealFor="men";
ref1.color="blue"; 
ref1.safe();



Helmet ref2=new Helmet();
ref2.type="ccc";
ref.size=HelmetSize.SMALL;
ref2.idealFor="women";
ref2.color="black";
ref2.savelives();
 
}


}
