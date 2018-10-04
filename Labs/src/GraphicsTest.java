import java.awt.*;
import java.applet.*;

public class GraphicsTest extends Applet {

	public void paint (Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(0,600,800,0);
		g.drawRect(0,0,800,600);

		
	}

}
