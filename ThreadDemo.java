class Hi extends Thread {
	public void show() throws InterruptedException{
		for (int n = 5; n > 0; n--){
			System.out.println("Hi");
			Thread.sleep(500);
		}
	}
}

class Hello extends Thread {
	public void show() throws InterruptedException{
		for (int n = 5; n > 0; n--){
			System.out.println("Hello");
			Thread.sleep(500);
		}
	}
}

class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Thread t = Thread.currentThread();

		System.out.println("Current Thread is "+t);

		t.setName("Update");
		System.out.println("Update Thread is "+t);

		for (int i = 0; i <= 5; i++){
			System.out.println(i);
			Thread.sleep(1000);

		obj1.start();
		obj2.start();
		}
	}
}