package AccountProject;

public class Account {
	double balance;
	
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
	public void withdraw(double amt)
	{
		balance = balance - amt;
	}
}
