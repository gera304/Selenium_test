package test;

public class Shape {
	
	public Shape() 
	{
		
		System.out.println("default shape");
	}

	public Shape(int a) 
	
	{
		this(2,3);
		System.out.println("one para shape");
	}
	
	public Shape(int a, int b) 
	{
		System.out.println("two para shape");
	}


}
