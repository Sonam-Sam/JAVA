//Import scanner packages for the calculating the values
import java.util.Scanner;
public class CircleRect{
	// Main method should place inside class
	public static void main(String args[]){
		
	/*Creating a Scanner object giving any name on it.
	Ex: I have created name scan for scanner
	*/
	Scanner scan = new Scanner(System.in);
	
	int Radius;
	System.out.println("Enter the radius: ");
		Radius = scan.nextInt();
		
		if(Radius <= 0){
			System.out.println("Sorry! radius cannot define in negative. ");
		}
		else{
			System.out.println("The area of circle is "+(3.14*Radius*Radius));
		}
		
		int width;
		int height;
		
		// Making a prompt from a user inorder not to confuse them
		System.out.println("Enter width of the rectangle: ");
			width = scan.nextInt();
		
		System.out.println("Enter height of the rectangle: ");
			height = scan.nextInt();
			
		/*
		|| represents 'or' that is either of the value
		*/
		if((width <= 0) || (height <= 0)){
			System.out.println("Input should be real values: ");
		}
		else{
			System.out.println("The area of the rectangle is: "+(width*height));
			System.out.println("And it's perimeter is: "+2*(width+height));
			System.out.println("Hence proved! ");
		}
	}
}