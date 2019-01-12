package TrainProject;

import java.awt.*;

public class Connector {

	private int x;
	
	public Connector(Graphics g, int x1)
	{
		x = x1;
		drawConnector(g);
	}
	
	public void drawConnector(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(x, 330, 20, 15);
	}
	
}
