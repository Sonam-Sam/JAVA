// import Scanner class
import java.util.Scanner;
class Employee{
	int EmpID;
	String EmpName;
	
	Employee(int ID, String Name){
		int EmpID = ID;
		EmpName = Name;
	}
	public void Emp(){
		System.out.println("This employee ID "+EmpID+" belongs to "+EmpName);
	}
}

class Array{
	public static void main(String[] args){
		int Size;
		String EmpName;
		
		// Creating scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		Size = scan.nextInt();
		Employee[] obj = new Employee[Size];
		
		for(int i = 0; i < Size; i++){
			System.out.println("Enter Employee ID: ");
			int obj[i] = scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("Enter Employee Name: ");
			EmpName = scan.nextLine();
		}
		System.out.println("");
	}
}