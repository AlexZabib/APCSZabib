package AccountProject;

public class AccountTest2 {

	public static void main(String[] args) {
		SavingsAccount a1 = new SavingsAccount(1000, .1);
		
		System.out.println("The balance in your savings account is: " + a1.getBalance());
//------------------------------------------------------------
		CheckingAccount c1 = new CheckingAccount(100, 50);
		
		System.out.println("The amount in your checking account is: $" + c1.getBalance() + " and the amount in your overdraft is: $" + c1.getOverDraft() + "\n" );
		
		System.out.println("Withdraw: " + c1.withdraw(151));
		System.out.println("The amount in your checking account is: $" + c1.getBalance() + " and the amount in your overdraft is: $" + c1.getOverDraft() + "\n");
		
		System.out.println("Withdraw: " + c1.withdraw(100));
		System.out.println("The amount in your checking account is: $" + c1.getBalance() + " and the amount in your overdraft is: $" + c1.getOverDraft() + "\n");
		
		System.out.println("Withdraw: " + c1.withdraw(49));
		System.out.println("The amount in your checking account is: $" + c1.getBalance() + " and the amount in your overdraft is: $" + c1.getOverDraft() + "\n");
		
	}

}
