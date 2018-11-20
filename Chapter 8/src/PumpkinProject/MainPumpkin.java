package PumpkinProject;

public class MainPumpkin {

	private double weight;
	private double pricePerPound;
	
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
		pricePerPound = weight * .25;
		return pricePerPound;
	}
	public void grow()
	{
		weight = weight + .5;
	}
}
