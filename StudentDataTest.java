class StudentData{
	int stuID, stuAge; 
	String Name;
	
	StudentData(int id, int age, String name){
		stuID = id;
		stuAge = age;
		Name = name;
	}
	
	void getStuID(){
		System.out.println(StuID);
	}
	void getStuAge(){
		System.out.println(StuAge);
	}
	void getStuName(){
		System.out.println(Name);
	}
	
	public void show(){
		System.out.println("Student name is "+Name);
		System.out.println("Student ID is "+stuID);
		System.out.println("Student age is "+stuAge);
		
	}
	
}

class StudentDataTest{
	public static void main(String[] args){
		
		StudentData obj1 = new StudentData(999, 199, "xxxx");
		
		
		
		obj1.getStuID();
		obj1.getStuAge();
		obj1.getStuName();
		
		
		
	}
}