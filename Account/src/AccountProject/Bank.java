package AccountProject;

public class Bank {
	private Customer[] customers = new Customer[100];
	private int numberOfCustomers = customers.length;
	
	public Bank()
	{
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l, int initBalance)
	{
		Customer c = new Customer(f, l, initBalance);
		numberOfCustomers = numberOfCustomers + 1; //updates the number of customer objects.
		customers[numberOfCustomers] = c; //placed the new customer object into the array.
	}

	public int getNumofCustomers()
	{
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index)
	{
		return customers[index];
	}
}
