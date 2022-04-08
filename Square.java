// Import scanner package
import java.util.Scanner;
public class Square{
	// Finding of sum of squares between 0 to users input
	public static void main(String args[]){
			int n;
			int SqOfEven = 0;
			int SqOfOdd = 0;
			int first = 0;
			int last;
			
			// Creating scanner object
			Scanner scan = new Scanner(System.in);
			
			// Prompt and make user to specify the work he or she should do
			System.out.println("Enter end number: ");
			last = scan.nextInt();
			
			for(n = 0; n <= last; n++){
				if(n % 2 == 0){  // Even checking
					SqOfEven += n*n;
				}
				else{  // Obviously the odd
					SqOfOdd += n*n;
				}
			}
			System.out.println("The squares of even number is "+SqOfEven);
			System.out.println("The squares of odd number is "+SqOfOdd);
	}
}