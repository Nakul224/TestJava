
public class InstanceExample {
	int x;
	float y=20;
	static int z=30;
	public static void main(String []args)
	{
		InstanceExample i=new InstanceExample();
	System.out.println(z);
		System.out.println(i.x);
		System.out.println(i.y);
		i.m2();
		m2();

	}
public void m1()
{    System.out.println(z);
	System.out.println(x);
	System.out.println(y);
}
public static void m2()
{	m1();
	System.out.println("hello");
}
}
