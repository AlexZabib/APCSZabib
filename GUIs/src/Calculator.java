import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	//create frame, panels, and buttons
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
	JButton dec = new JButton(".");
		
	double a; //first number entered
	double b; //second number entered
	double result; //result of two numbers in relation to operation chosen
	int operator; //sets operation in the case block from 149-157
	
	public Calculator() {
		myFrame.setLayout(new GridLayout(3,1)); //sets grid for 3 panels
		buttons.setLayout(new GridLayout(4,4)); //sets grid for the numbers
		
		//allows buttons to be read in block of code from lines 96-167
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
		dec.addActionListener(this);
		
		//add text box to the text panel
		text.add(answer);
		
		//add buttons to the button panel
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(div);
		
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(mult);
		
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(sub);
		
		buttons.add(dec);
		buttons.add(zero);
		buttons.add(equal);
		buttons.add(plus);
		
		//add the delete and clear buttons to the del/clear panel
		dc.add(del);
		dc.add(clear);

		myFrame.add(text);
		myFrame.add(buttons);
		myFrame.add(dc);
		myFrame.setTitle("Calculator");
		myFrame.setSize(200, 300);
		myFrame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("1")) //concatenates one to the text box
			answer.setText(answer.getText() + "1");
		else if(str.equals("2")) //concatenates two to the text box
			answer.setText(answer.getText() + "2");
		else if(str.equals("3"))  //concatenates three to the text box
			answer.setText(answer.getText() + "3");
		else if(str.equals("4")) //concatenates four to the text box
			answer.setText(answer.getText() + "4");
		else if(str.equals("5")) //concatenates five to the text box
			answer.setText(answer.getText() + "5");
		else if(str.equals("6")) //concatenates six to the text box
			answer.setText(answer.getText() + "6");
		else if(str.equals("7")) //concatenates seven to the text box
			answer.setText(answer.getText() + "7");
		else if(str.equals("8")) //concatenates eight to the text box
			answer.setText(answer.getText() + "8");
		else if(str.equals("9")) //concatenates nine to the text box
			answer.setText(answer.getText() + "9");
		else if(str.equals("0")) //concatenates zero to the text box
			answer.setText(answer.getText() + "0");
		else if(str.equals(".")) //concatenates a decimal to the text box
			answer.setText(answer.getText() + ".");
		else if(str.equals("Clear")) //clears the text box and sets the operator to 0 so if equals is hit after clear and before an operation is clicked you get 0
		{
			answer.setText("");
			operator = 0;
		}
		if(e.getSource()==plus){ 
			a=Double.parseDouble(answer.getText()); //sets first number to value entered for later computation
			operator=1; //sets operator to 1 so it knows to add
			answer.setText(""); //clears box but store first number
		} 
		if(e.getSource()==sub){
			a=Double.parseDouble(answer.getText());
			operator=2; //sets operator to 2 so it knows to subtract
			answer.setText("");
		}	
		if(e.getSource()==mult){
			a=Double.parseDouble(answer.getText());
			operator=3; //sets operator to 3 so it knows to multiply
			answer.setText("");
		}
		if(e.getSource()==div){
			a=Double.parseDouble(answer.getText());
			operator=4; //sets operator to 4 so it knows to divide
			answer.setText("");
		}
		if(e.getSource()==equal){
			b=Double.parseDouble(answer.getText()); //sets second number to value entered for computation
			switch(operator){
				case 1: result = a+b;
					break;
				case 2: result = a-b;
					break;
				case 3: result = a*b;
					break;		
				case 4: result = a/b;
					break;
				default: result = 0; //after clear with no second number entered pressing equal will print 0
			}
			answer.setText(""+result); //clear text box of value b and print answer
		}
		if(str.equals("Delete")){
			String s=answer.getText();
			answer.setText("");
			for(int i=0;i<s.length()-1;i++)
				answer.setText(answer.getText()+s.charAt(i));
			//this block takes the string in label(Answer) and prints the string without the last most value
		}
	}
	
	public static void main (String args[])
	{
		new Calculator();
	}
}
