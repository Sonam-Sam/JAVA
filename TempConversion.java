// Import packages
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculation {  // Static Class that calculate Fahrenheit and Celcius 
	static double Celsius (double x1) { 
		double y1;
		y1 = (x1*(9/5) + 32);
		return y1;
	} 

	static double Fahrenheit (double x2) {
		double y2;
		y2 = ((x2-32) * 5/9);
		return y2;
	}
} // Class end

// Main class that 
class TempConversion extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	JRadioButton r1, r2, r3, r4;
	JButton button;
	JPanel p1, p2, p3, p4, p5, p6;
	
	TempConversion(){ // Creating constructor 
		setTitle("Temperature Converter"); // Setting a title
		
		p1 = new JPanel(new FlowLayout()); // Panel p1 are set to FlowLayout
		l1 = new JLabel("Input");
		t1 = new JTextField(5);
		p1.add(l1); // Label and TextField are added to Panel
		p1.add(t1);
		//p1.setBackground(Color.green);
		
		p2 = new JPanel();
		// Used BoxLayout in Panel p2 to set the Label and RadioButton in Y_AXIS
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS)); 
		l2 = new JLabel("Input Scale");
		r1 = new JRadioButton("Celsius");
		r2 = new JRadioButton("Fahrenheit");
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		p2.add(l2);
		p2.add(r1);
		p2.add(r2);
		//p2.setBackground(Color.red);

		p3 = new JPanel();
		// Used BoxLayout for Panel p3 to set the Label and RadioButton in Y_AXIS
		p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
		l3 = new JLabel("Output Scale");
		r3 = new JRadioButton("Celsius");
		r4 = new JRadioButton("Fahrenheit");
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(r3);
		bg2.add(r4);
		p3.add(l3);
		p3.add(r3);
		p3.add(r4);
		//p3.setBackground(Color.cyan);

		p4 = new JPanel();
		button = new JButton("Calculate");
		// Set size for the Button
		button.setPreferredSize(new Dimension(100,70));
		p4.add(button);
		button.addActionListener(this); // Added a action to Button 
		//p4.setBackground(Color.yellow);
		
		p5 = new JPanel(new FlowLayout());
		l4 = new JLabel("Output");
		t2 = new JTextField(5);
		p5.add(l4);
		p5.add(t2);
		//p5.setBackground(Color.blue);

		p6 = new JPanel();
		// Create new Panel to add all the Previous panel and then to add them into frame
		p6.setLayout(new BorderLayout());
		// Set the Layout into Borderlayout and added to different borders
		p6.add(p1, BorderLayout.NORTH);
		p6.add(p2, BorderLayout.WEST);
		p6.add(p3, BorderLayout.EAST);
		p6.add(p4, BorderLayout.CENTER);
		p6.add(p5, BorderLayout.SOUTH);

		add(p6); // Adding panel 6 to the frame

		setSize(300, 200); // Initialize zize of the frame 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	// Defining the actionPerformed method to do an action
	public void actionPerformed(ActionEvent e){ 
		try{ // Puttting the action into try block 
			String num = t1.getText();
			
			if(num.isEmpty() == true){
				String str1 = "Input cannot be Empty";
				// Adding the message to MessageDialog box 
				JOptionPane.showMessageDialog(this, str1, "Message", JOptionPane.INFORMATION_MESSAGE);
			}
				
			else if(r1.isSelected() && r4.isSelected()){
				// Converting a String into Integers
				double x = Double.parseDouble(num);
				t2.setText(Calculation.Celsius(x) + " F"); // Showing a output in TextField t2		
			}

			else if(r1.isSelected() && r3.isSelected()){
				double x = Double.parseDouble(num);
				t2.setText(x + " C");	
			}

			else if(r2.isSelected() && r3.isSelected()){
				double x = Double.parseDouble(num);
				t2.setText(Calculation.Fahrenheit(x) + " C");
			}

			else if(r2.isSelected() && r4.isSelected()){
				double x = Double.parseDouble(num);
				t2.setText(x + " F");
			}

			else if((r1.isSelected() == false) || (r2.isSelected() == false) || (r3.isSelected() == false) || (r4.isSelected() == false)){
				String str2 = "Choose RadioButton";
				JOptionPane.showMessageDialog(this, str2, "Message", JOptionPane.INFORMATION_MESSAGE);
			
			}


		}catch(NumberFormatException ex){ 
			String str3 = "Enter Integers";
			JOptionPane.showMessageDialog(this, str3, "Message", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	// Defining a main method
	public static void main(String[] args){
		new TempConversion(); // Creating a object to call a Class
	}
}
