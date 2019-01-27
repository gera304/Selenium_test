package test;

public class Wrapper {

	public static void main(String[] args) {
		
		//Integer i=new Integer(12);    //Create object of integer class
		
		//Integer j=12345;               // Create object of inger class by class name
		
		String a="1234";        //String
		Integer k=Integer.parseInt(a);   //Convert into integer
		k=k+10;  //Add 10
		String b=k.toString();   //Convert integer into string
		System.out.println(b);   // print8
		
		

	}

}
