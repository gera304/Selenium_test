package test;

public class Son extends Father {

	
	public void sum(int a, int b, int c)
	{
		int z= a+b+c;
		System.out.println(z);
		System.out.println("son method");
	}
	
	public static void main(String[] args) {
		
		Son s= new Son();
		s.sum(2, 2, 2);
		
	}
}
