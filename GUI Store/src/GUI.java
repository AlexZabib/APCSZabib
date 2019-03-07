import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	JFrame gui = new JFrame();
	
	JPanel butt = new JPanel();
	JPanel insert = new JPanel();
	JPanel butt1 = new JPanel();
	JPanel butt2 = new JPanel();
	JPanel butt3 = new JPanel();
	JPanel field = new JPanel();
	
	JButton size = new JButton("Size");
	JButton style = new JButton("Style");
	JButton color = new JButton("Color");
	JButton price = new JButton("Price");
	JButton amount = new JButton("Amount");
	JButton id = new JButton("ID");
	
	JLabel Size = new JLabel("Size: ");
	JLabel Style = new JLabel("Style: ");
	JLabel Color = new JLabel("Color: ");
	JLabel Price = new JLabel("Price: ");
	JLabel Amount = new JLabel("Amount: ");
	JLabel ID = new JLabel("ID: ");
	JLabel test = new JLabel("Test: ");
	
	
	JButton search = new JButton("Search ID");
	JTextField input = new JTextField();
	JButton add = new JButton("Add Item");
	JButton sub = new JButton("Remove Item");
	JButton clear = new JButton("Clear");
	
	Inventory i1 = new Inventory();
	
	String si;
	String sty;
	String c;
	double p = -1;
	int a = -1;
	int i = -1;
	
	public GUI() 
	{
		gui.setLayout(new GridLayout(1,2));
		butt.setLayout(new GridLayout(2,1));
		insert.setLayout(new GridLayout(6,2));
		butt1.setLayout(new GridLayout(1,2));
		field.setLayout(new GridLayout(2,1));
		butt2.setLayout(new GridLayout(2,1));
		butt3.setLayout(new GridLayout(1,2));
		
		search.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		size.addActionListener(this);
		style.addActionListener(this);
		color.addActionListener(this);
		price.addActionListener(this);
		amount.addActionListener(this);
		id.addActionListener(this);
		
		insert.add(Size);
		insert.add(size);
		insert.add(Style);
		insert.add(style);
		insert.add(Color);
		insert.add(color);
		insert.add(Price);
		insert.add(price);
		insert.add(Amount);
		insert.add(amount);
		insert.add(ID);
		insert.add(id);
		
		butt.add(field);
		butt.add(butt2);
		butt2.add(butt3);
		
		field.add(test);
		field.add(butt1);
		butt1.add(search);
		butt1.add(input);
		butt3.add(add);
		butt3.add(sub);
		butt2.add(clear);
		
		
		gui.add(insert);
		gui.add(butt);
		gui.setTitle("The Shirt Store");
		gui.setSize(500, 500);
		gui.setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String inp = e.getActionCommand();
		
		if(inp.equals("Size"))
		{
			si = input.getText();
			Size.setText("Size: " + input.getText());
			input.setText("");
		}
		if(inp.equals("Style"))
		{
			sty = input.getText();
			Style.setText("Style: " + input.getText());
			input.setText("");
		}
		if(inp.equals("Color"))
		{
			c = input.getText();
			Color.setText("Color: " + input.getText());
			input.setText("");
		}
		if(inp.equals("Price"))
		{
			p = Double.parseDouble(input.getText());
			Price.setText("Price: " + input.getText());
			input.setText("");
		}
		if(inp.equals("Amount"))
		{
			a = Integer.parseInt(input.getText());
			Amount.setText("Amount: " + input.getText());
			input.setText("");
		}
		if(inp.equals("ID"))
		{
			i = Integer.parseInt(input.getText());
			ID.setText("ID: " + input.getText());
			input.setText("");
		}
		if(inp.equals("Add Item"))
		{
			Shirt s = new Shirt(si, sty, c, p, a, i);
			i1.addItem(s);
			test.setText("Test: " + si +" "+ sty +" "+ c +" "+ p +" "+ a +" "+ i);
			Size.setText("Size: ");
			Style.setText("Style: ");
			Color.setText("Color: ");
			Price.setText("Price: ");
			Amount.setText("Amount: ");
			ID.setText("ID: ");
		}
		if(inp.equals("Remove Item"))
		{
			Shirt s = new Shirt(si, sty, c, p, a, i);
			i1.removeItem(s);
			Size.setText("Size: ");
			Style.setText("Style: ");
			Color.setText("Color: ");
			Price.setText("Price: ");
			Amount.setText("Amount: ");
			ID.setText("ID: ");
		}
		if(inp.equals("Search"))
		{
			try {
				int index = i1.findIndexByID(i);
				si = i1.getSize(index);
				sty = i1.getStyle(index);
				c = i1.getColor(index);
				p = i1.getPrice(index);
				a = i1.getAmount(index);
				i = i1.getID(index);
			
				Size.setText("Size: " + si);
				Style.setText("Style: " + sty); 
				Color.setText("Color: " + c);  
				Price.setText("Price: " + p); 
				Amount.setText("Amount: " + a); 
				ID.setText("ID: " + i); 
			}
			catch(Exception x)
			{
				test.setText("This order isn't in your cart");
			}
		}
		if(inp.equals("Clear"))
		{
			test.setText("Test: ");
			Size.setText("Size: ");
			Style.setText("Style: ");
			Color.setText("Color: ");
			Price.setText("Price: ");
			Amount.setText("Amount: ");
			ID.setText("ID: ");
			input.setText("");
		}
	}
	
	
	public static void main (String[] args)
	{
		GUI g = new GUI();
	}
}
