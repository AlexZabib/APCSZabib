package TrainProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Locomotive extends TrainCar{
	
		private int x;
		
		public Locomotive(Graphics g, int x1) 
		{
			super(g, Color.blue, x1);
			x = x1;
			drawChimney(g);
			drawNose(g);
			drawDriver(g);
		}
		
		public void drawChimney(Graphics g)
		{
			g.setColor(Color.black);
			Polygon chimney = new Polygon();
			chimney.addPoint(x+30, 250);
			chimney.addPoint(x+30, 230);
			chimney.addPoint(x+20, 210);
			chimney.addPoint(x+60, 210);
			chimney.addPoint(x+50, 230);
			chimney.addPoint(x+50, 250);
			g.fillPolygon(chimney);
		}
		
		public void drawNose(Graphics g)
		{
			g.setColor(Color.black);
			Polygon nose = new Polygon();
			nose.addPoint(x, 350);
			nose.addPoint(x-40, 350);
			nose.addPoint(x, 310);
			g.fillPolygon(nose);
		}
		
		public void drawDriver(Graphics g)
		{
			g.setColor(Color.white);
			g.fillRect(x+15, 270, 30, 25);
			g.setColor(Color.black);
			g.fillOval(x+18,270,25,25);
			g.setColor(Color.white);
			g.fillOval(x+22,275,7,7);
			g.fillOval(x+32,275,7,7);
		
		}
}
