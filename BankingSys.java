// Import Scanner Obj 
import java.util.Scanner;

// Creating the Class Option
class Option{
	double ini_amount = 500; // Initial amount in the account
	
	// Method to deposite money
	double Add(double a){
		return ini_amount += a;
	}
	
	// Method to Withdraw money
	double Sub(double b){
		return ini_amount -= b;	
	}
		
	// To check the balance in the account
	double Check(){
			return ini_amount;	
	}
}

class BankingSys{ // Main class 
	public static void main(String[] args){ // Main method
		// Creating scanner object
		Scanner scan = new Scanner(System.in);
		// Class object
		Option obj = new Option();
		
		int choice; // initializing the choice into int 
		double balance;
		
		do{
			// Displaying the menu bar for the user with different choice
			System.out.println("*****MENU*****");
			System.out.println("1. Deposite Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Quit");
			
			// Propting the user to enter their choice
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
			
			switch(choice){ // Using switch case 
				case 1:
					System.out.println("Enter the amount to Deposite: "); // For Deposite the money
					double a = scan.nextDouble();
					System.out.println(obj.Add(a));
					break;
					
				case 2:
					System.out.println("Enter the amount to be Withdraw: "); // Foe withdrawing of money
					double b = scan.nextDouble();
					System.out.println(obj.Sub(b));
					break;
				
				case 3:
					System.out.println(obj.Check()); // To check the balance
					break;
				
			}
		}while(choice != 4); // To quit 
	}
}