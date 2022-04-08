// Import scanner from the util packages
//import scanner
import java.util.Scanner;

// Made class as Triangle
public class Triangle{
	//Created a method is_equilateral
	public static void is_equilateral(){
		
		//New object for Scanner
		Scanner scan = new Scanner(System.in);
		
		int side_a;
		int side_b;
		int side_c;
		System.out.println("Enter side_a: ");
		side_a = scan.nextInt();
		
		System.out.println("Enter side_b: ");
		side_b = scan.nextInt();
		
		System.out.println("Enter side_c: ");
		side_c = scan.nextInt();
		
		if((side_a == side_b) & (side_b == side_c)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	public static void main(String args[]){
		is_equilateral();  //Called the new method in main method
	}
		
	
}