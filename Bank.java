class StudentData {
	int StdID, StdAge;
	String Name;

	StudentData(Int Id, String N, int age){
		StdID = Id;
		Name = N;
		StdAge = age;
	} 

	int getStdID(){
		return Id;
	}

	String getStdName(){
		return N;
	}

	int getStdAge(){
		return age;
	}
}

class Bank {
	public static void main(String[] args){
		StudentData st = new StudentData(123, Sonam, 22);
		StudentData st1 = new StudentData(132, Wangmo, 20);

		st.getStdID();
		st.getStdName();
		st.getStdAge();
		st1.getStdID();
		st1.getStdName();
		st1.getStdAge();
	}
}