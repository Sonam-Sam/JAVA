class Calc{
	public int add(int i, int j){ 
		return i+j;	
	}
}

class Calculator{
	public int add(int i, int j){ 
		return i+j;	
	}
	public int sub(int a, int b){
		
		return a-b;
	}
}

class VerArg{
	public static void main(String[] args){
		Calc obj = new Calc();
		Calculator obj1 = new Calculator();
		Calculator obj2 = new Calculator();
		
		int result = obj.add(5,4);
		double result1 = obj1.add(5,4);
		int result2 = obj2.sub(2,4);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
}