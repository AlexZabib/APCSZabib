public class Shirt {
	private char Size;
	private String Style;
	private int Price;
	private String Color;
	private int Amount;
	private int id;
	
	public Shirt(char si, String sty, int p, String c, int Amt, int id)
	{
		Size = si;
		Style = sty;
		Price = p;
		Color = c;
		Amount = Amt;
		this.id = id;
	}
	
	public char getSize()
	{
		return Size;
	}
	public String getStyle()
	{
		return Style;
	}
	public int getPrice()
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
	public int getId() {
		return id;
	}
}
