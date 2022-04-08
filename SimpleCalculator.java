// import Scanner
import java.util.Scanner;

class Calculator{
	int Add(int a, int b){
		return a + b;
	}
	int Subtract(int a, int b){
		return a - b;
	}
	int Divide(int a, int b){
		return a / b;
	}
	int Multiply(int a, int b){
		return a * b;
	}
	int Mod(int a, int b){
		return a % b;
	}
}// End class

class SimpleCalculator{
	public static void main(String[] args){// Define main method
		int a = 0;
		int b = 0;
		int result;
		int Choice;
		
		// Creating Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Creating Class object
		Calculator obj = new Calculator();

		do{ // Do while loop
			System.out.println("***Simple Calculator***");
			System.out.println("1. Enter two number: ");
			System.out.println("2. Addition ");
			System.out.println("3. Subtraction ");
			System.out.println("4. Division ");
			System.out.println("5. Multiplication ");
			System.out.println("6. Modulus ");
			System.out.println("7. Exit ");
			
			
					
			System.out.println("Enter your Choice: ");
			Choice = scan.nextInt();

			switch(Choice){
				
				case 1:
					System.out.println("Enter two number: ");
					a = scan.nextInt();
					b = scan.nextInt();
					break;
	
				case 2:
					result = obj.Add(a, b);
					System.out.println("The Sum of two number is: "+result);
					
				case 3:
					result = obj.Subtract(a, b);
					System.out.println("The Difference of two number is: "+result);
					break;
				
				case 4:
					result = obj.Divide(a, b);
					System.out.println("The Quotient of two number is: "+result);
					break;


				case 5:
					result = obj.Multiply(a, b);
					System.out.println("The Product of two number is: "+result);
					break;

				case 6:
					result = obj.Mod(a, b);
					System.out.println("The Modulus of two number is: "+result);
					break;


			}
		}while(Choice !=7);
	}// End method
}// End class
