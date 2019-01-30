package test;

public class Star {

	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)                       //Printing * from 1 to 5
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k=1; k<=5; k++)
		{
			for(int l=5; l>=k; l--)
			{
				System.out.print("*");            // Printing * from 5 to 1
			}
			System.out.println();
		}

	}

}
