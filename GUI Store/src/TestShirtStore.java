import java.util.*;

public class TestShirtStore {
	public static void main(String[] args)
	{
		Inventory stock = new Inventory();
		
		
		//------------Starting Inventory-------------

		/*Shirt s1 = new Shirt("S", "Long Sleeve", 60.00, "Blue", 100, 1001, "S Blue Long Sleeve");
		stock.addItem(s1);
		Shirt s2 = new Shirt("M", "Long Sleeve", 60.00, "Blue", 100, 1002, "M Blue Long Sleeve");
		stock.addItem(s2);
		Shirt s3 = new Shirt("L", "Long Sleeve", 60.00, "Blue", 100, 1003, "L Blue Long Sleeve");
		stock.addItem(s3);
		
		
		int index = stock.findIndexByID(1001);
		System.out.println("ID is: " + stock.getID(index));
		System.out.println("Name is: " + stock.getName(index) +"\n");
		
		System.out.println("ID is: " + stock.getID(1));
		System.out.println("Name is: " + stock.getName(1) +"\n");
		
		System.out.println("ID is: " + stock.getID(2));
		System.out.println("Name is: " + stock.getName(2) +"\n");*/
		
		stock.readFile();
		
		
		stock.writeData();


	}
	
}
