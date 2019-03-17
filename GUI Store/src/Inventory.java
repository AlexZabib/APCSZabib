import java.util.ArrayList;
import java.io.*;

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
	
	//-------------------------------------------------
	
	public String getSize(int index)
	{
		return products.get(index).getSize();
	}
	public String getStyle(int index)
	{
		return products.get(index).getStyle();
	}
	public double getPrice(int index)
	{
		return products.get(index).getPrice();
	}
	public String getColor(int index)
	{
		return products.get(index).getColor();
	}
	public int getID(int index)
	{
		return products.get(index).getID();
	}
	public int getAmount(int index)
	{
		return products.get(index).getAmount();
	}
	
	//------------------------------------------------
	
	public void writeData()
	{
		try {
			FileWriter fr = new FileWriter("out.txt");
			//-----Each line will have ArrayList data
			for(Shirt it : products) {
				fr.write(it.getSize() + " " + it.getStyle() + " " + it.getPrice() + " " + it.getColor() + " " + it.getAmount() + " " + it.getID() + " " + " " + "\n");	
			}
			fr.close();
			
		}
		catch(Exception failure)
		{
			System.out.println(failure);
		}
	}
	public void readFile()
	{
		try
		{
			FileReader fr = new FileReader("out.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while( (line = br.readLine()) !=null)
			{
				String[] parts = line.split(" ");
			
			
			String size = parts[0]; 
			String style = parts[1];
			double price = Double.parseDouble(parts[2]);
			String color = parts[3];
			int amount = Integer.parseInt(parts[4]);
			int id = Integer.parseInt(parts[5]);
			
			Shirt s1 = new Shirt(size, style, color, price, amount, id);
			products.add(s1);
			
			}
		fr.close();
		}
		catch(Exception failure)
		{
			System.out.println(failure);
		}
	}
}
