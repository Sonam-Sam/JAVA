import java.awt.*;
import javax.swing.*;

class MyGridLayout{
	JFrame j;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	MyGridLayout(){
		j = new JFrame("GridLayout Example");

		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		j.add(b1); j.add(b2); j.add(b3); j.add(b4); 
		j.add(b5); j.add(b6); j.add(b7); j.add(b8); 
		j.add(b9);

		j.setLayout(new GridLayout(3, 3, 2, 2));

		j.setSize(100, 100);
		j.setVisible(true);
	}
	public static void main(String[] args){
		MyGridLayout gr = new MyGridLayout();
	}
}