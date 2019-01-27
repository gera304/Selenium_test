package test;

 public class Dell {

	 private void walk()
	 {
		 System.out.println("abc");
	 }
	public static void talk()
	{
		System.out.println("Talk");
	}
	
	public int sum(int a)
	{
		return a;
		
	}
	public static void main(String[] args) {
		Dell d= new Dell();
		int sum_result=d.sum(10);
		System.out.println(sum_result);
		//System.out.println(d.sum(10));
		
	}
	
}
