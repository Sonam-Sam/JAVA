// Imported Scanner packages for calculating
import java.util.Scanner;

// I have created a class as Grade
public class Grade{
	public static void main(String args[]){ // called a new method in the main method
		toGrade();
		}
		// created new method called toGrade 
		public static void toGrade(){
			
		// creating scanner obj
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the mark: ");
		int a = scan.nextInt(); //scan.nextInt will proceed further requirement of integers if necessary
		
		// & ampersand
		if(85 <= a && a <= 100){ 
			System.out.println("Grade A");
		}
		else if(70 <= a && a <= 84){
			System.out.println("Grade B");
		}
		else if(55 <= a && a <= 69){
			System.out.println("Grade C");
		}
		else if(40 <= a && a <= 54){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Grade F");
		}
	}
}