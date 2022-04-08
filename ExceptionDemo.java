class ExceptionDemo {
	public static void main (String[] args){
		int marks[] = {35, 42, 21, 50, 63};

		try{
			System.out.println("Here is a list of Marks");

			for(int i = 0; i<Marks.length; i++){
				System.out.println(Marks[i]);
			}
			System.out.println();

			int x = Marks[5];
			System.out.println("The marks of the student is "+x);

			int y = Marks[6];

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Your index is out of bound ");
		}


	}
}