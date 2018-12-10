package AccountProject;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer zabib = new Customer("Alex", "Zabib", 1000);
		Account zabibAcct = zabib.getAccount();
		zabibAcct.deposit(500);
		zabibAcct.withdraw(300);
		System.out.println(zabib.getAccount().getBalance());
		
		
	}

}
