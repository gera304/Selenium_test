package test;

public class Home {
	
	static int a;
	
	public void inc()
	{
		a=a+1;
	}

	public static void main(String[] args) {
		
		Home obj= new Home();
		System.out.println(obj.a);
		obj.inc();
		System.out.println(obj.a);
		
		Home obj2= new Home();
		obj.inc();
		System.out.println(obj2.a);
		
	}

}
