package test;


public class Variable {

	int a;
	
	public void test(int b)
	{
		System.out.println(b);
	}
 
	public static void main(String[] args) {
		Variable v= new Variable();
		System.out.println(v.a=200);
		v.test(20);
		
	}
     
}


