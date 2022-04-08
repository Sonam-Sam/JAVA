import java.awt.*;
import javax.swing.*;

class RegistrationPage{
	public static void main(String[] args){
		JFrame f = new JFrame("Registration Form");
		JLabel l, l1, l2, l3, l4, l5, l6, l7;
		JTextField t1, t2, t3, t4, t5, t6, t7;
		JRadioButton r1, r2;
		JButton jb, jc;
		
		l = new JLabel("Registration Form");
		l.setBounds(100, 70, 120, 30);
		
		l1 = new JLabel("First Name");
		l1.setBounds(50,100, 120,30);
		t1 = new JTextField();
		t1.setBounds(130,105, 120,20);
		
		l2 = new JLabel("Last Name");
		l2.setBounds(50, 130, 120, 30);
		t3 = new JTextField();
		t3.setBounds(130,135, 120,20);
		
		l3 = new JLabel("Gender:");
		l3.setBounds(50,160, 120,30);
		r1 = new JRadioButton("Male");
		r1.setBounds(70,185, 120,20);
		r2 = new JRadioButton("Female");
		r2.setBounds(70, 215, 120, 20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		l4 = new JLabel("Address");
		l4.setBounds(50, 245, 120, 30);
		String country[] = {"USA", "Canada", "Sri Lanka", "Bhutan", "India", "Bangladesh", "Europe", "Japen"};
		JComboBox cb1 = new JComboBox(country);
		cb1.setBounds(120, 245, 120,20);
		
		l5 = new JLabel("Email: ");
		l5.setBounds(50,275, 120,30);
		t4 = new JTextField(" ");
		t4.setBounds(130,280, 120,20);
		
		l6 = new JLabel("Password");
		l6.setBounds(50,305, 120,30);
		t5 = new JPasswordField();
		t5.setBounds(130,310, 120,20);
		
		l7 = new JLabel("Confirm Password ");
		l7.setBounds(50,335, 120,30);
		t6 = new JPasswordField();
		t6.setBounds(170,340, 120,20);
		
		JCheckBox cb = new JCheckBox("Accept");
		cb.setBounds(100, 375, 120, 30);
		
		// Button icon
		jb = new JButton("Register");
		jb.setBounds(50, 405, 90, 20);
		jc = new JButton("Exit");
		jc.setBounds(150, 405, 90, 20);
		
		f.add(l);// Adding the label to the frame 
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		
		f.add(r1); // Radiobutton
		f.add(r2);
		
		f.add(t1);//Adding textfield to the frame
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(cb);
		f.add(cb1);
		
		f.add(jb);// Button
		f.add(jc);
	
		f.setSize(300, 350);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
	}
}