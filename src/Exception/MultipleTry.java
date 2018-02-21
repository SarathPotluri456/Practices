package Exception;

public class MultipleTry {
	
	public static void main(String []args)
	
	{
		try
		{
			try
			{
				int i=50/0;
				
			}catch(ArithmeticException e)
			{
				System.out.println("Arthmetic Exception Arised");
			}
			try
			{
				int a[]=new int[10];
				a[12]=30;
				
				
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexoutofBound Exception Occured");
			}
			
		}catch(Exception e)
		{
			System.out.println("The Exception Occured");
		}
		finally
		{
			System.out.println("This is final");
			
		}
	}

}
