class InsufficientFundException extends RuntimeException
{
	InsufficientFundException(String s)
	{
		super(s);
	}
};

class  Account
{
	private int balance=1000;
	public void withdraw(int amount)
	{
		if(amount>balance)
		{
			throw  new InsufficientFundException("Your balance is lesser than amount enterde");
		}
		System.out.println("Plz take your money:::"+amount);
	}
	public static void main(String[] args) 
	{		
		Account a=new Account();
		a.withdraw(Integer.parseInt(args[0]));

	}
}
