interface A
{
	public void m1();
}
class B implements A
{
	public void m1()
	{
		System.out.println("BBB class implementation");
	}
}
class C implements A
{
	public void m1()
	{
		System.out.println("CCC class implementation");
	}
}
class D
{
	public static A m2()
	{
		return new C();
	}
	public static void main(String[] args) 
	{
		A i=D.m2();
		i.m1();//?????
	}
}