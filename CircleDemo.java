// Import Scanner package
import java.util.Scanner;

// Defining Class
class Circle{
	int radius;
	double pi = 3.1428;
	float f = (float)pi;
	
	Circle(int r){ // Constructor
		radius = r;// initializing the value of r to radius
	}
	
	public float Circumference(){
		return 2*((f) * radius); // returns the circumference
	}
	
	public float Area(){
		return (f)*(radius * radius); // Area of the circle
	}
	
	public float SphericalVolume(){
		return ((4/3)*(f)*radius*radius*radius); // returns the SphericalVolume
	} // End method
} //End class

public class CircleDemo{ // Defining main class
	public static void main(String[] args){ //Defining main function 
		// Creating scanner object
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter radius of the circle :"); // Prompt to the user
		int radius = obj.nextInt();	
		
		Circle object = new Circle(radius); // class object
		System.out.println("The circumference of the  circle is: " +object.Circumference());
		System.out.println("The area of the  circle is: " +object.Area());
		System.out.println("The volume of the  circle is: " +object.SphericalVolume());
	} //End method
}//End class

