import java.awt.*;
import java.applet.*;

public class GraphicsLab01v110 extends Applet{
	public void paint(Graphics g){
		//DRAW CUBE
		g.setColor(Color.blue);
		g.drawRect(50, 50, 300, 300);
		g.drawRect(150, 150, 300, 300);
		g.drawLine(50, 50, 150, 150);
		g.drawLine(350, 50, 450, 150);
		g.drawLine(50, 350, 150, 450);
		g.drawLine(350, 350, 450, 450);

		//DRAW SPHERE in cube
		g.setColor(Color.red);
		g.drawOval(100, 100, 300, 300);
		g.drawOval(100, 212, 300, 75);
		g.drawOval(100, 175, 300, 150);
		g.drawOval(100, 138, 300, 225);
		g.drawOval(213, 100, 75, 300);
		g.drawOval(175, 100, 150, 300);
		g.drawOval(138, 100, 225, 300);
		
		//DRAW TRAINGLE
		g.setColor(Color.darkGray);
		g.drawLine(400, 600, 400, 900);
		g.drawLine(100, 900, 700, 900);
		g.drawLine(100, 900, 400, 600);
		g.drawLine(400, 600, 700, 900);
		g.drawLine(250, 750, 700, 900);
		g.drawLine(550, 750, 100, 900);
		
		//DRAW PRISM
		g.setColor(Color.magenta);
		g.drawLine(500, 450, 650, 150);
		g.drawLine(650, 150, 800, 450);
		g.drawLine(800, 450, 500, 450);
		g.drawLine(650, 400, 800, 100);
		g.drawLine(800, 100, 950, 400);
		g.drawLine(950, 400, 650, 400);
		g.drawLine(500, 450, 650, 400);
		g.drawLine(650, 150, 800, 100);
		g.drawLine(800, 450, 950, 400);
			
		
		
		
		
	}

}
