package TrainProject;

import java.awt.Color;
import java.awt.Graphics;

public class WindowTrain extends TrainCar{
			
		private int x;
		
		public WindowTrain(Graphics g, int x1){
			super(g,Color.red,x1);
			x = x1;
			drawWindows(g);
			drawTop(g);
			
		}	
		
		public void drawWindows(Graphics g){
		    g.setColor(Color.white);
		    g.fillRect(x+30,280,30,30);
		    g.fillRect(x+90,280,30,30);
		}
		
		public void drawTop(Graphics g)
		{
			g.setColor(Color.black);
			g.fillRect(x+15, 230, 120, 10);
			//g.setColor(Color.red);
			g.fillRect(x+20, 240, 110, 10);
		}
		

}
