import java.util.ArrayList;

public class Inventory {

	ArrayList<Shirt> products;
	
	public Inventory() {
		products = new ArrayList<Shirt>();
	}
	
	public void addItem(Shirt s) {
		products.add(s);
	}
	
	public void removeItem(Shirt s) {
		products.remove(s);
	}
	
	public int findIndexByID(int ID)
	{
		for(int i = 0; i<=products.size(); i++)
		{
			if( (products.get(i).getID()) == ID)
				return i;
		}
		return -1;
	}
	
	public int findIndexByName(String Name)
	{
		for(int i = 0; i<=products.size(); i++)
		{
			if( (products.get(i).getName()).equals(Name))
				return i;
		}
		return -1;
	}
	
	public int getID(int index)
	{
		return products.get(index).getID();
	}
	
	public String getName(int index)
	{
		return products.get(index).getName();
	}
	
	/*public int qtySet(int ID, int a)
	{
		products.get(ID).getAmount() = a;
	}*/
}
