package PumpkinProject;

public class TestPumpkins {

	public static void main (String[] args)
	{
		/*
		MainPumpkin skinnypumpkin = new MainPumpkin(5);
		MainPumpkin normalpumpkin = new MainPumpkin(10);
		MainPumpkin fatpumpkin = new MainPumpkin(15);
		
		System.out.println("First pumpkin weighs: " + skinnypumpkin.getWeight());
		skinnypumpkin.setWeight(100);
		System.out.println("First pumpkin weighs: " + skinnypumpkin.getWeight());
		skinnypumpkin.setWeight(999);
		System.out.println("First pumpkin weighs: " + skinnypumpkin.getWeight());
		skinnypumpkin.setWeight(1000);
		System.out.println("First pumpkin weighs: " + skinnypumpkin.getWeight());
		
		
		System.out.println("Second pumpkin weighs: " + normalpumpkin.getWeight());
		System.out.println("Third pumpkin weighs: " + fatpumpkin.getWeight());
			*/
		//-------------------------------------------------------------------------
		MainPumpkin p1 = new MainPumpkin(10);
		MainPumpkin p2 = new MainPumpkin(25);
		MainPumpkin p3 = new MainPumpkin(50);
		
		System.out.println("The total weight of the Pumpkins is: " + (p1.getWeight() + p2.getWeight() + p3.getWeight()));
		System.out.println("The total price of the three pumpkins is: " + (p1.getPPP() + p2.getPPP() + p3.getPPP()) + "\n");
		
		System.out.println("The weight of the first pumpkin is:  " + p1.getWeight() + " and its price is: " + p1.getPPP());
		System.out.println("The weight of the second pumpkin is:  " + p2.getWeight() + " and its price is: " + p2.getPPP());
		System.out.println("The weight of the third pumpkin is:  " + p3.getWeight() + " and its price is: " + p3.getPPP() + "\n");
		
		
		for(int i = 1; i<=5 ; i++)
		{
			p1.grow();
			p2.grow();
			p3.grow();
		}
		
		System.out.println("After 5 weeks, the weight of the first pumpkin is:  " + p1.getWeight() + " and its price is: " + p1.getPPP());
		System.out.println("After 5 weeks, the weight of the second pumpkin is:  " + p2.getWeight() + " and its price is: " + p2.getPPP());
		System.out.println("After 5 weeks, the weight of the third pumpkin is:  " + p3.getWeight() + " and its price is: " + p3.getPPP());
		
	}
	
	
}
