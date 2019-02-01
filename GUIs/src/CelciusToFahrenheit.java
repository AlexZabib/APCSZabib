import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusToFahrenheit implements ActionListener{

	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JLabel fvalue;
	JTextField cels;
	JButton conv;
	
	public CelciusToFahrenheit() {
		myPanel.setLayout(new FlowLayout());
		
		cels = new JTextField("           ");
		conv = new JButton("Convert");
		fvalue = new JLabel("Fahrenheit");
		
		conv.addActionListener(this);
		
		myPanel.add(cels);
		myPanel.add(conv);
		myPanel.add(fvalue);
		
		myFrame.add(myPanel);
		myFrame.setTitle("Convert Celsius to Fahrenheit");
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("Convert")) {
			double celcius = Double.parseDouble(cels.getText());
			double convert = celcius*(9/5) + 32;
			
			fvalue.setText(convert + "fahrentheit");
		}
	}
	
	public static void main (String args[])
	{
		new CelciusToFahrenheit();
	}
}
