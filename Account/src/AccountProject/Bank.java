package AccountProject;

public class Bank {
	private Customer[] customers = new Customer[100];
	private int numberOfCustomer = customers.length;
	
	public Bank()
	{
		numberOfCustomer = 0;
	}
	
	public void addCustomer(String f, String l, double initBalance)
	{
		Customer c = new Customer(f, l, initBalance);
		customers[numberOfCustomer] = c; //placed the new customer object into the array.
		numberOfCustomer = numberOfCustomer + 1; //updates the number of customer objects.
		
	}

	public int getNumofCustomers()
	{
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index)
	{
		return customers[index];
	}
}
