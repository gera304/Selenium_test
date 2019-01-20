package test;

public class  A  {
	
	public A() 
	{
		
		System.out.println("Default parent constructor");
	}
	
	public A(int a)
	{
		this(11,22);
		System.out.println("one para parent constructor");
	}
	
	public A(int a, int b)
	{
		this();
		System.out.println("Two para parent constructor");
	}


	public static void main(String[] args) {
    
		
	}

}
