package test;

public class OYO {
	
public int i;
	
	public void sum(int a, int b)
	{
		int z= a+b;
		System.out.println(z);
	}
	
	/*public void setI(int i) {
		this.i=i;
	}
*/
	
	static void sub()
	{
		int a=20;
		int b=2;
		int c= a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		OYO obj= new OYO();
		//obj.setI(2);
		obj.i=32;
		obj.sum(10, 3);
		OYO.sub();
		System.out.println(obj.i);
	}

}
