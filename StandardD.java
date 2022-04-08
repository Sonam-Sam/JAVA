// Import Scanner Class
import java.util.Scanner;

public class StandardD{
	public static void main(String[] args){
		int i, j;
		int sum = 0;
		double element;
		double difference = 0;
		double square;
		double Standard_Deviation;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int num = scan.nextInt();
		
		double array[] = new double[(int)num];
		for(i = 0; i < num; i++ ){
			System.out.println("enter your elements: "+i);
			element = scan.nextDouble();
			
			array[i] = element;
		}
		for(j = 0; j < array.length; j++){
			System.out.println( +array[j]+ " ");
		}
		System.out.println(" ");
		
		for(i = 0; i < num; i++){
			sum = (int)(sum + array[i]);
		}
		double mean = (double)(sum)/num;
		System.out.println("The mean of your Elements is: "+mean);
		
		for(i = 0; i < num; i++){
			difference = (double)(array[i] - mean);
			System.out.println("The difference of the Elements is: "+difference);
		
		}
		
		square = Math.pow(difference,2);
		System.out.println("The squares of the difference is: "+square);
		
		
		double average = Math.pow(difference,2)/num;
		System.out.println("The average difference is: "+average);
		
		Standard_Deviation = Math.sqrt(average);
		System.out.println("The square of the Average is: " +Standard_Deviation);
		
	}//End main 
}//end class