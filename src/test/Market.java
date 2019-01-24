package test;

public class Market {

	
	public int sum(int a, int b)
	{
		
		int c=a+b;
		return c;
	}
	
	public void sub(int sum_result, int b)
	{
		int z= sum_result-b;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Market obj= new Market();
		int sum_result=obj.sum(2, 3);
		obj.sub(sum_result, 5);
	}
}
