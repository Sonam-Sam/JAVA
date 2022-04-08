class ThreadDemo{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("Current Thread is "+t);

		t.setName("Update");
		System.out.println("Update Thread is "+t);

		for (int i = 0, i <= 5, i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}