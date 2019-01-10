package HotelProject;
import java.awt.*;

public class HotelRoom {
	private int roomNum;
	private int x;
	private int y;
	private int w;
	private int l;
	
	public HotelRoom(Graphics g, int num, int xCoord, int yCoord, int width, int length) {
		roomNum = num;
		x = xCoord;
		y = yCoord;
		w = width;
		l = length;
		
		g.setColor(Color.gray);
		g.fillRect(x,y,w,l);
	}
	
	/*public int getRoomNumber() {
		return roomNum;
	}*/
	
	
}