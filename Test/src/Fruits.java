interface Item
{     public abstract void items();
}
class Van implements Item
{	 public void items()
	{
		System.out.println("apples and mangoes");
	}
}; 
class Fruits
{	public Item shopping()
	{
		return new Van();
	}
	public static void main(String[] args) 
	{
		Fruits t=new Fruits();
		Item i=t.shopping();
		i.items();//apples and mangoes
	}
}
