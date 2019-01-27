package test;

public class HP extends Dell {
	
	
	public static void main(String[] args) {
		HP obj= new HP();
		obj.talk();
		int result=obj.sum(9);
		System.out.println("Result = " +result);
		
		HP.talk();
		
	}

}
