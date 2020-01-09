class parent
{
}
class child1 extends parent
{
}
class child2 extends parent
{
}
class child3 extends parent
{
}
class Test1
{
	public child1  m1()
	{//child1 c1=new child();
	//return c1;
	return new child1();
	}
	public child2  m2()
	{
	return new child2();
	}
	public child3 m3()
	{
	return new child3();
	}
public static void main( String [] agggg)
{
Test1 t1=new Test1();
parent p1=t1.m1();
parent p2=t1.m2();
parent p3=t1.m3();
}
}