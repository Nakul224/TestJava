class A
{
	public void m1()
	{
		System.out.println("AAA class implementation");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("BBB class implementation");
	}
}
class C extends A
{
	public void m1()
	{
		System.out.println("CCC class implementation");
	}
}
class E
{
	public static A m2()
	{
		return new C();
	}
	public static void main(String[] args) 
	{
		A i=E.m2();
		i.m1();//CCCC

	}
}
 
