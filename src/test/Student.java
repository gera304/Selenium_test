package test;

public class Student {
	
	int age;
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcomw all");
	}

	
	public void display2()
	{
		System.out.println("Welcome all of you");
	}
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.display1();
		s1.display2();
		
		Student s2= new Student();
		s2.age=10;
		s2.roll_no=1;
		System.out.println(s2.age);
		System.out.println(s2.roll_no);
		
		
		
		
		
		
	}

}
