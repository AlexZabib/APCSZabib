package AccountProject;

public class Account {
	protected double balance;
	
	public Account(double bal)
	{
		balance = bal;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	public boolean withdraw(double amt)
	{
		boolean take;
		balance = balance - amt;
		if(balance < 0)
		{
			balance = balance + amt;
			return take = false;
		}
		else 
		{
			balance = balance;
			return take = true;	
		}
	}
	

}
