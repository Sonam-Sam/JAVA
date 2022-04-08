import java.util.Scanner;
class Bicycle{
	int Gear;
	int Speed;
	
	Bicycle(int G, int S){
		Gear = G;
		Speed = S;
	}
	int applyBrake(){
		return Speed--;
	}
	
	int speedUp(){
		return Speed++;
	}
	
	void tostring(){
		System.out.println("The speed of the Bike is: "+Speed+ " cm");
	}
}

class MountainBike extends Bicycle{
	int seatHeight;
	
	MountainBike(int G, int S, int H){
		super(G, S);
		seatHeight = H;
	}
	void setHeight(){
		System.out.println("The height of the seat is: "+seatHeight + " cm");
	}
	
	void tostring(){
		System.out.println("The speed of the MountainBike is: "+ Speed + " km/h");
	}
} 

class BicycleDemo{
	public static void main(String[] args){
		int height, gear, speed;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter height of the Seat: ");
		height = scan.nextInt();
		
		System.out.println("Enter gear number: ");
		gear = scan.nextInt();
		
		System.out.println("Enter speed of the bike: ");
		speed = scan.nextInt();
		
		Bicycle bi = new Bicycle(height, gear);
		System.out.println("The number of break in a bike is: "+bi.applyBrake());
		System.out.println("The speedup of the bike is: "+bi.speedUp());
		bi.tostring();
		
		MountainBike mbi = new MountainBike(height, gear, speed);
		
		mbi.setHeight();
		mbi.tostring();
		
		
	}
}