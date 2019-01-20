package test;

public class Class3 {

	public int add (int a, int b)
	{
		
		int c;
		c= a+b;
		return c;
		
		
		
	}
	public void sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Result " +c);
	}
	public static void main(String[] args) {
		
	Class3 obj= new Class3();
	int sum_result=	obj.add(10, 2);
	System.out.println("Sum = " +sum_result);
	obj.sub(sum_result, 1000);
	for(int i=0; i<=10; i++)
	{
		System.out.println("Print loop " +i);
	}
		
	}	
	
}
