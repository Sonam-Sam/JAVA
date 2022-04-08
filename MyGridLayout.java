class A {
	int i, j;
	A(int a, int b){
		i = a;
		j = b;
	}

	void show (){
		System.out.println("i and j is "+i+" "+j);
	}
}
class B extends A {
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show(){
		System.out.println("value of c is "+c);
	}
}
class MyGridLayout {
	public static void main (String[] args){
		A superob = new A(2, 3);
		B subob = new B(5, 6,  7);

		superob.show();
		subob.show();
	}
}