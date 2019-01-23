package test;

public class SBI implements Bank{
	
	public void sum()
	{
		System.out.println("sum");
	}

	
	public void sub()
	{
		System.out.println("SUB");
	}
	public static void main(String[] args) {
		
		SBI obj= new SBI();
		obj.sum();
		obj.sub();
				
		
	}

}
