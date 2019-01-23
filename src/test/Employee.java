package test;

public class Employee {
	
	public static void sum(int a, int b)
	{
		int c= a+b;
		int z=a-b;
		System.out.println("Result = " +z);
		System.out.println("Result= " +c);
	}

	public static void main(String[] args) {
		
		Employee obj= new Employee();
		obj.sum(10, 2);
		//Employee.sum(2, 2);
		//Employee.sum(25,5);

	}

}
