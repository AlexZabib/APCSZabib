import java.applet.*;
import java.awt.*;


public class GraphicsLab02v80 extends Applet{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		// Draw bottom-left corner
		for(int i=0; i<=490; i=i+10){
			g.drawLine(10+(i*2),640,990, 640-i);
			//g.drawLine(990,10+i,990-i, 640-i);
		}
		
	
		// Draw bottom-right corner
		
		
		// Draw top-right corner
		
				
		// Draw top-left corner
	
	}

}
