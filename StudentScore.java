// Import Scanner class
import java.util.Scanner;
public class StudentScore{
	
	public static void main(String[] args){ // main function defined
		Scanner scan = new Scanner(System.in);
		
		int score[][] = new int[6][5]; // an array of size row 6 and column 5
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		// Asking user for their score
		for(int i = 0; i < 6; i++){
			for(int j =0; j < 5; j++){
				System.out.println("Enter the score of "+i+","+j); // prompt
				score[i][j] = scan.nextInt();
			}
		}
		System.out.println("The scores in matrix form will be: ");
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(" "+score[i][j]);
			}
			System.out.println();
		}
		// Average marks of the students
		//std1:
		for(int j = 0; j < 5; ){
			sum1 = sum1 + score[0][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg1 = sum1/5;
		System.out.println("The average marks for std1 is "+avg1);
		
		//std2:
		for(int j = 0; j < 5; ){
			sum2 = sum2 + score[1][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg2 = sum2/5;
		System.out.println("The average marks for std2 is "+avg2);
		
		//std3:
		for(int j = 0; j < 5; ){
			sum3 = sum3 + score[2][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg3 = sum3/5;
		System.out.println("The average marks for std3 is "+avg3);
		
		//std4:
		for(int j = 0; j < 5; ){
			sum4 = sum4 + score[3][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg4 = sum4/5;
		System.out.println("The average marks for std4 is "+avg4);
		
		//std5:
		for(int j = 0; j < 5; ){
			sum5 = sum5 + score[4][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg5 = sum5/5;
		System.out.println("The average marks for std5 is "+avg5);
		
		//std6:
		for(int j = 0; j < 5; ){
			sum6 = sum6 + score[5][j]; 
			System.out.println(sum1);
			j++;
		}
		double avg6 = sum6/5;
		System.out.println("The average marks for std6 is "+avg6);
	}
}