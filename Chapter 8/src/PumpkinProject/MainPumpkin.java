package PumpkinProject;

public class MainPumpkin {

	private double weight;
	private double pricePerPound = .25;
	
	public MainPumpkin(double pounds)
	{
		weight = pounds;
	}
	public void setWeight(double w)
	{
		if (w < 1000)
			weight = w;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getPPP()
	{
		double price = weight * pricePerPound;
		return price;
	}
	public void grow()
	{
		weight = weight + .5;
	}
}
