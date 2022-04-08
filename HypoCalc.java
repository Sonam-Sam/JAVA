// Importing a Package
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// Creating a class name HypoCalc that implements ActionListener
class HypoCalc extends JFrame implements ActionListener{
	JLabel l1, l2, l3;
	JTextField t1, t2;
	JPanel p1, p2, p3, p4, p5;
	JButton b1, b2;
	
	HypoCalc(){ // Constructor
		setTitle("Hypotenuse Calculator");
		
		p1 = new JPanel(new FlowLayout());
		l1 = new JLabel("Enter side a: ");
		t1 = new JTextField(5);
		// Adding the Label and TextField to the Panel p1
		p1.add(l1);
		p1.add(t1);
		//p1.setBackground(Color.green);
		
		p2 = new JPanel(new FlowLayout());
		l2 = new JLabel("Enter side b: ");
		t2 = new JTextField(5);
		p2.add(l2);
		p2.add(t2);
		//p2.setBackground(Color.green);
		
		p3 = new JPanel(new FlowLayout());
		l3 = new JLabel("Hypotenuse");
		p3.add(l3);
		//p3.setBackground(Color.cyan);
		
		p4 = new JPanel(new FlowLayout());
		b1 = new JButton("Calculate");
		b2 = new JButton("Clear");
		p4.add(b1);
		p4.add(b2);
		//p4.setBackground(Color.red);
		// Registering the action to tow button
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p5 = new JPanel();
		// Adding all panel into Panel p5 
		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);
		// Making the p5 Layout as BoxLayout in Y_AXIS 
		p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
		
		add(p5); // Adding to the frame
		
		setSize(300, 200);
		setVisible(true);
	}
	// Defining a actionPerformed method
	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource() == b1){
				// Initializing the input fromt1 and t2 to num1 and num2 respectively
				String num1 = t1.getText();
				String num2 = t2.getText();

				if(num1.isEmpty() == true || num2.isEmpty() == true){
					String x ="The textfield cannot be Empty ";
					// Showing a output in MessageDialog box 
					JOptionPane.showMessageDialog(this, x, "Message", JOptionPane.INFORMATION_MESSAGE);
				}else{
					// Converting a String into Integers
					double x = Double.parseDouble(num1);
					double x1 = Double.parseDouble(num2);
					
					double y = Math.sqrt((x*x) + (x1*x1)); 
					// Formula to find hypotaneous
					l3.setText("Hypotenuse: "+" The hypotaneous of "+ x + " and " + x1 + " is " + y);
				}
				
			}else if(e.getSource() == b2){ // For clearing the TextField
				t1.setText("");
				t2.setText("");
				l3.setText("");
			}
			
		}catch(NumberFormatException ex){ // Printing a NumberFormatException
			String str = "Enter Number";	
			JOptionPane.showMessageDialog(this, str, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	// Defining a main method to call main class
	public static void main(String[] args){
		new HypoCalc();
	}
}
