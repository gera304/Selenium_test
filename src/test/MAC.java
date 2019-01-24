package test;

public class MAC {
	
	int i;
	int j;

	
	public void walk()
	{
		int k=10;
		int l=20;
		int m= k+l;
		System.out.println(m);
	}
	public static void main(String[] args) {
		
		MAC obj= new MAC();
		obj.i=10;
		System.out.println(obj.i);
		obj.walk();
		
	}

}
