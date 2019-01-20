package test;

public class Marks {

	public Marks()
	{
		
		
		System.out.println("default cons");
	}
	
	public Marks(int a)
	{
		this(20,30);
		System.out.println("one pera");
	}

	public Marks(int a, int b)
	{
		System.out.println("three para");
	}
	
	public static void main(String[] args) {
		
		Marks m= new Marks(10);
	}
	
}
