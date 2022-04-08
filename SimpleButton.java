import java.awt.*;

class SimpleButton{
	public static void main(String[] args){
		Frame f = new Frame("Simple Button");
		
		Button b = new Button("Click Here");
		
		b.setBounds(50, 100, 90, 30);
		b.setForeground(Color.green);
		
		f.add(b);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}