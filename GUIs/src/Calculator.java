import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	JFrame myFrame = new JFrame();
	JPanel text = new JPanel();
	JPanel buttons = new JPanel();
	JPanel dc = new JPanel();
	JLabel answer = new JLabel("                  ");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton plus = new JButton("+");
	JButton sub = new JButton("-");
	JButton mult = new JButton("*");
	JButton div = new JButton("/");
	JButton equal = new JButton("=");
	JButton clear = new JButton("Clear");
	JButton del = new JButton("Delete");
	JLabel s1 = new JLabel("");
	JLabel s2 = new JLabel("");
	
	
	public Calculator() {
		myFrame.setLayout(new GridLayout(3,1));
		buttons.setLayout(new GridLayout(4,4));
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		plus.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		del.addActionListener(this);
		
		text.add(answer);
		
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(plus);
		
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(sub);
		
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(mult);
		
		buttons.add(s1);
		buttons.add(zero);
		buttons.add(s2);
		buttons.add(div);
		
		
		
		dc.add(equal);
		dc.add(del);
		dc.add(clear);
		
		
		
		
		myFrame.add(text);
		myFrame.add(buttons);
		myFrame.add(dc);
		myFrame.setTitle("Calculator");
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("1")) 
			answer.setText(answer.getText() + "1");
		else if(str.equals("2"))
			answer.setText(answer.getText() + "2");
		else if(str.equals("3")) 
			answer.setText(answer.getText() + "3");
		else if(str.equals("4")) 
			answer.setText(answer.getText() + "4");
		else if(str.equals("5")) 
			answer.setText(answer.getText() + "5");
		else if(str.equals("6")) 
			answer.setText(answer.getText() + "6");
		else if(str.equals("7")) 
			answer.setText(answer.getText() + "7");
		else if(str.equals("8")) 
			answer.setText(answer.getText() + "8");
		else if(str.equals("9")) 
			answer.setText(answer.getText() + "9");
		else if(str.equals("0")) 
			answer.setText(answer.getText() + "0");
		else if(str.equals("+"))
			answer.setText(answer.getText() + "+");
		else if(str.equals("-"))
			answer.setText(answer.getText() + "-");
		else if(str.equals("*"))
			answer.setText(answer.getText() + "*");
		else if(str.equals("/"))
			answer.setText(answer.getText() + "/");
		else if(str.equals("="))
			answer.setText("");
		else if(str.equals("Delete"))
			answer.setText("");
		else if(str.equals("Clear"))
			answer.setText(" ");
		
	}
	
	public static void main (String args[])
	{
		new Calculator();
	}
}
