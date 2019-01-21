package test;

public class Car extends Bike {
	
	public void run()
	{
		System.out.println("Bike can run");
	}

	public void walk()
	{
		System.out.println("car can walk");
	}
	public static void main(String[] args) {
		
		Car obj= new Car();
		obj.run();
		obj.walk();
		
	}

}
