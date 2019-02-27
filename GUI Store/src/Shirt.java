public class Shirt {
	private String Size;
	private String Style;
	private double Price;
	private String Color;
	private int Amount;
	private int id;
	private String Name;
	
	public Shirt(String si, String sty, double p, String c, int Amt, int id, String Name)
	{
		Size = si;
		Style = sty;
		Price = p;
		Color = c;
		Amount = Amt;
		this.id = id;
		this.Name = Name;
	}
	
	public String getSize()
	{
		return Size;
	}
	public String getStyle()
	{
		return Style;
	}
	public double getPrice()
	{
		return Price;
	}
	public String getColor()
	{
		return Color;
	}
	public int getAmount()
	{
		return Amount;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return Name;
	}
}
