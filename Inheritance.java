class test{
	int i, j;
	static void show(){
		System.out.println("Enter the values: "+i+ ","+j);
	}
}
// Creating inheritance
class Exam extends test{
	double l;
	static void showic(){
		System.out.println(l+" is the in heritance of test.");
	}
} 

public class Inheritance{
	public static void main(String[] args){
		test ob1 = new test();
		Exam ob2 = new Exam();
		//initializing a value to the instance variable in superclass
		ob1.i = 10;
		ob1.j = 15;
		System.out.println("The elements of super object:");
		
	}
}