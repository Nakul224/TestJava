class  Test4
{	int x=10;
	static int y=20;
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Sopln(t1.x);
		m3(t1);
		Sopln(y);
	}
	public void m1()
		{
		sopln(x);
		sopln(y);
		m2();
		m3();
		}
	public void m2()
		{
		sopln(x);
		sopln(y);
		}
	public static m3( Test p)
		{
		Sopln(p.x);
		sopln(y);
		p.m2();
		p.m1();
		}
}
