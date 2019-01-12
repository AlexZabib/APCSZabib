package TrainProject;

import java.awt.*;
import java.applet.*;


public class MyTrain extends Applet{
	
	public void paint(Graphics g)
	{
		for(int i = 390; i>=70; i=-16) {
			setBackground(Color.gray);
			TrainCar tc1 = new TrainCar(g,Color.blue,i);
			Connector c1 = new Connector(g, i+150);
			TrainCar tc2 = new TrainCar(g,Color.green,i+170);
			Connector c2 = new Connector(g, i+320);
			TrainCar tc3 = new TrainCar(g,Color.yellow, i+340);
			Connector c3 = new Connector(g, i+490);
			TrainCar tc4 = new TrainCar(g,Color.magenta,i+510);	
			WindowTrain cab = new WindowTrain(g, i+510);
			Locomotive drive = new Locomotive(g, i);
		}
	}

}
