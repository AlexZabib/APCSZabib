package AccountProject;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer zabib = new Customer("Alex", "Zabib", 1000);
		Account zabibAcct = zabib.getAccount();
		zabibAcct.deposit(500);
		zabibAcct.withdraw(300);
		System.out.println(zabib.getAccount().getBalance());
		
		
		//----------------------------------------------
		
		
		Bank piggyBank = new Bank();
		piggyBank.addCustomer("Jane", "Simms", 100);
		piggyBank.addCustomer("Owen" , "Bryant", 5);
		piggyBank.addCustomer("Tim", "Soley", 2);
		piggyBank.addCustomer("Maria", "Soley", 4);
		
		for(int i = 0; i<piggyBank.getNumofCustomers(); i++)
		{
			System.out.println(piggyBank.getCustomer(i).getFirstName() +" "+ piggyBank.getCustomer(i).getLastName() +"; Balance: " + piggyBank.getCustomer(i).getAccount().getBalance());
		}
		
	}

}
