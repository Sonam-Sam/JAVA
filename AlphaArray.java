// Defining Class
class AlphaArray{
	public static void main(String[] args){
		
		// Alphabet array
		char[] Alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
		
		// Printing entire character
		System.out.print("The entire character could be: ");
		for (char i = 0; i < Alpha.length; i++ ){ // .length will looks for highest length of an array
			System.out.print(Alpha[i] + " ");
		}
		System.out.println(" "); // Moving to next line
		
		// Printing only six character from array
		System.out.print("The First six character of the alphabet is: ");
		for (char i =0; i < 6; i++){
			System.out.print(Alpha[i] + " ");
		}
		System.out.println(" "); // Moving to next line
		
		// Printing tenth character that is in index 9
		System.out.println("The tenth character is: "+Alpha[9]);
	} // End method
} // End Class