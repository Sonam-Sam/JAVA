//Defining class
public class Command_line{
	public static void main(String[] args){
		double sum;
		
		int i;
		i = Integer.parseInt(args[0]);
		
		int j;
		j = Integer.parseInt(args[1]);
		
		int k;
		k = Integer.parseInt(args[2]);

		sum = i+j+k;
		
		System.out.println("The sum of the number is: "+sum);
	}// End main
}//End class