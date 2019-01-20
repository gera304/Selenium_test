package test;

public class B extends A {
	
	public B() 
	{
	   super(1);
		System.out.println("Default child constructor");
	}
	
	public B(int a)
	{
		this(11,22);
		System.out.println("Child one para constructor");
	}

	public B(int a, int b)
	{
		this();
		System.out.println("Child two para consructor ");
	}
	public static void main(String[] args) {
		
		B obj= new B(100);
		

	}

}
