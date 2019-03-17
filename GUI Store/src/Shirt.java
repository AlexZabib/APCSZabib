public class Shirt {
	private String Size;
	private String Style;
	private double Price;
	private String Color;
	private int Amount;
	private int id;
	
	
	public Shirt(String si, String sty,  String c, double p, int Amt, int id)
	{
		Size = si;
		Style = sty;
		Price = p;
		Color = c;
		Amount = Amt;
		this.id = id;
		
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
	
}
