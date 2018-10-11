import java.awt.*;
import java.applet.*;


public class GraphicsLab02v80 extends Applet{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		g.drawRect(250,320/2, 500, 330);
		int v1 =10;
		int v2 =640;
		int v3 =990;
		int v4 =20;
		int v5 =12;
		
			// Draw top-right corner
			for(int i=0; i<=49; i++){
				g.drawLine(v1+(i*v4),v1,v3, v1+(i*v5));
			}	
		
			// Draw bottom-right corner
			for(int i=0; i<=49; i++){
				g.drawLine(v1+(i*v4),v2,v3, v2-(i*v5));
			}	
		
		
			// Draw top-right corner
			for(int i=0; i<=49; i++){
				g.drawLine(v1,v2-(i*v5),v3-(i*v4), v2);
			}
		
				
			// Draw top-left corner
			for(int i=0; i<=49; i++){
				g.drawLine(v1,v1+(i*v5),v3-(i*v4), v1);
			}

	}

}
