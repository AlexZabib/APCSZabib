import java.util.ArrayList;

public class Inventory {

	ArrayList<Shirt> products;
	
	public Inventory() {
		products = new ArrayList<Shirt>();
	}
	
	public void addItem(Shirt s) {
		products.add(s);
	}
	
	public void removeItem(int i) {
		products.remove(i);
	}
	
/*	public int findIndexByName(String itemname)
	{
		
	}*/
}
