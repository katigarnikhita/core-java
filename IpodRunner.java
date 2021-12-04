class IpodRunner
{
public static void main(String[] args)
{
IPod ref=new IPod();
ref.name="apple";
ref.color="black";
ref.size=IPodSize.SMALL;
ref.price=300f;
ref.weight=20;

IPod ref1=new IPod();
ref1.name="apple";
ref1.color="black";
ref1.size=IPodSize.BIG;
ref1.price=300f;
ref1.weight=20;
ref1.videoplayer();


IPod ref2=new IPod();
ref2.name="apple";
ref2.color="black";
ref2.size=IPodSize.MEDIUM;
ref2.price=300f;
ref2.weight=20;
ref2.communication();








}
}


 