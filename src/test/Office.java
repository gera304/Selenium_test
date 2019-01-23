package test;

public class Office {
	
	int a;
	
	public  void inc()
	{
		a=a+1;
		System.out.println("value" +a);
	}

   public static void main(String[] args) {
	   
	   Office obj= new Office();
	   obj.inc();
	   /*System.out.println(obj.a);
	   obj.inc();
	  System.out.println(obj.a);
	  
	  Office obj2= new Office();
	  obj2.inc();
	  System.out.println(obj2.a);*/
	
}

	}

