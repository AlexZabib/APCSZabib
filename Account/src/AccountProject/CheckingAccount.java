package AccountProject;

public class CheckingAccount extends Account{
	protected double overdraftAmount;
	
	public CheckingAccount(double bal, double overdraft)
	{
		super(bal);
		overdraftAmount = overdraft;
	}
	public CheckingAccount(double bal)
	{
		super(bal);
	}
	public double getOverDraft() 
	{
		return overdraftAmount;
	}
	public boolean withdraw(double amt)
	{
		boolean take;
		
		if((balance - amt) < -overdraftAmount)
		{
			return take = false;
		}
		else if((balance - amt) < 0)
		{
			overdraftAmount += (balance - amt);
			balance = 0;
			return take = true;
		}
		else
		{
			balance -= amt;
			return take = true;
		}
	}
}
