import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class UserCalculator extends JFrame implements ItemListener{
	JLabel l1, l2, l3, l4;
	JPanel p1, p2;
	JTextField t1,t2;
	JComboBox cb;
	
	UserCalculator(){
		setTitle("GUI Calculator");
		setLayout(new FlowLayout);
		p1 = new Panel();
		p2 = new Panel();
		
		l1 = new JLabel("Enter first number: ");
		t1 = new JTextField();
		
		l2 = new JLabel("Enter second number: ");
		t2 = new JTextField();
		p1.setLayout(new BoxLayout(p1, BoxLayout(1, 4)));
		
		l3 = new JLabel("Select Operation: ");
		String[] operation = {" ", "Addition", "Subtraction", "Multiplication", "Modulus"};
		cb = new JComboBox(operation);
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		add(l3);
		add(cb);
	}
	public static void main(String[] args){
		new UserCalculation();
	}
}



