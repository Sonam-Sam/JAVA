import java.util.Scanner;

class GradeBook {
	String CourseName;

	void setCourseName(){
		System.out.println("I am taking "+CourseName);
	}

	void getCourseName(){
		System.out.println(CourseName);
	}

	void displayMessage(){
		System.out.println("Welcome to "+CourseName);
	}
}

class GradeBookTest{
	public static void main(String[] args){
		GradeBook gb = new GradeBook();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your course Name ");
		String CourseName = scan.nextLine();

		gb.setCourseName();
		gb.getCourseName();
		gb.displayMessage();
	}
}