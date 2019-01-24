package test;

public class Circle extends Shape {
	
	public Circle() 
	{  
		super(1);
		System.out.println("Default circle");
	}
	
	public Circle(int a) 
	{
		System.out.println("one para circle");
	}

	public Circle(int a, int b) 
	{
		System.out.println("two para circle");
	}

	public static void main(String[] args) {
		
		
		Circle obj= new Circle();
	}
	

}
