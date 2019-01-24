package test;

public class House {

	
	public House() 
	{
		
		int a=10;
		System.out.println("Default constructor" +a);
	}
	
	
    public House(int a, int b)
    {
    	
    	int z= a-b;
    	System.out.println("Sub result= " +z);
    }
    
    public House(int a , int b, int c)
    {
    	this(10,2);
    	int z= a+b+c;
    	System.out.println("Add reult = " +z);
    }
	public static void main(String[] args) {
		
		House obj= new House(3,2,3);
	}
}
