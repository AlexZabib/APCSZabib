public class Shirt {
	private char Size;
	private String Style;
	private double Price;
	private String Color;
	private int Amount;
	private int id;
	private String Name;
	
	public Shirt(char si, String sty, double p, String c, int Amt, int id, String Name)
	{
		Size = si;
		Style = sty;
		Price = p;
		Color = c;
		Amount = Amt;
		this.id = id;
		this.Name = Name;
	}
	
	public char getSize()
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
