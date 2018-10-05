import java.awt.*;
import java.applet.*;

public class GraphicsLab01v90 extends Applet{
	public void paint(Graphics g){
		//DRAW CUBE
		g.setColor(Color.blue);
		g.drawRect(50, 50, 300, 300);
		g.drawRect(150, 150, 300, 300);
		g.drawLine(50, 50, 150, 150);
		g.drawLine(350, 50, 450, 150);
		g.drawLine(50, 350, 150, 450);
		g.drawLine(350, 350, 450, 450);

		//DRAW SPHERE
		g.drawOval(500, 50, 300, 300);
		g.drawOval(500, 150, 300, 100);
		g.drawOval(500, 100, 300, 200);
		g.drawOval(600, 50, 100, 300);
		g.drawOval(550, 50, 200, 300);
		
		//DRAW TRAINGLE
		
		
		
	}
}
