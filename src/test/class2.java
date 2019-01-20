package test;

public class class2 {
	
	public int sum (int a, int b) 
	{
		int c;
		c= a+b;
		return c;
		
	}
	public int sub(int a, int b)
	{
		return a-b;
	}

	public void mul(int a, int b)
	{
	
		int c =a*b;
		
		System.out.println("Result = "+c);
	}
	
	public static void main(String[] args) {
		
	class2 obj1= new class2();
	int sum_result=	obj1.sum(10, 0);
	int sub_result=obj1.sub(10, 0);
	 obj1.mul(sum_result, sub_result);
		
	}
}
