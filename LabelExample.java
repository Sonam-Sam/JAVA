import java.awt.*;

class LabelExample extends Frame{
	Label l1, l2;
	
	LabelExample(){
		l1 = new Label("Enter First Name: ");
		l1.setBounds(50,100, 100,30);
		l1.setForeground(Color.blue);
		
		l2 = new Label("Enter Last Name: ");
		l2.setBounds(50,150, 100,30);
		l2.setForeground(Color.red);
		
		add(l1);
		add(l2);
		
		setSize(300, 300);
		setLayout(null);
	
	}
	public static void main(String[] args){
		LabelExample l = new LabelExample();
		
		l.setVisible(true);
	}
}