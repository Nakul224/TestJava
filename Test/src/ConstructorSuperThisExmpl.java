class Zee
{	int rollno;
	Zee()
	{ 	System.out.println("hello Zeeeeeeee");
	}
	Zee(int rollllls)
	{
	rollno=rollllls;
	}
};
class Bee extends Zee
{   	String name;
	Bee(int r,String nammmmme)
	{	super(r);
		name=nammmmme;
	System.out.println(" hello Beeeeeeee");
	}
};
class Zeebra
{
public static void main(String[] args) 
	{
		Bee b=new Bee(100,"shiva");
		System.out.println(b.rollno+",,,,"+b.name);
	}
}
