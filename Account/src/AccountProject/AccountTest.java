package AccountProject;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account(100);
		
		System.out.println("The amount of money in the account is: " + a1.getBalance());
		
		a1.deposit(50.00);
		a1.withdraw(147.00);
		
		System.out.println("After depositing $50.00 and withdrawing $147.00, your balance is: " + a1.getBalance());
		
		

	}

}
