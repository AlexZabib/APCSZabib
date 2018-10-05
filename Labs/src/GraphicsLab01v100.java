import java.awt.*;
import java.applet.*;

public class GraphicsLab01v100 extends Applet{
	public void paint(Graphics g){
		//DRAW CUBE
		g.setColor(Color.blue);
		g.drawRect(25, 25, 300, 300);
		g.drawRect(125, 125, 300, 300);
		g.drawLine(25, 25, 125, 125);
		g.drawLine(325, 25, 425, 125);
		g.drawLine(25, 325, 125, 425);
		g.drawLine(325, 325, 425, 425);

		//DRAW SPHERE
		g.drawOval(500, 50, 300, 300);
		g.drawOval(500, 162, 300, 75);
		g.drawOval(500, 125, 300, 150);
		g.drawOval(500, 88, 300, 225);
		g.drawOval(613, 50, 75, 300);
		g.drawOval(575, 50, 150, 300);
		g.drawOval(538, 50, 225, 300);
		
		//DRAW TRAINGLE
		g.drawLine(400, 600, 400, 900);
		g.drawLine(100, 900, 700, 900);
		g.drawLine(100, 900, 400, 600);
		g.drawLine(400, 600, 700, 900);
		g.drawLine(250, 750, 700, 900);
		g.drawLine(550, 750, 100, 900);
		
		
	}
}
