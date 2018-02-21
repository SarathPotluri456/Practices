package Exception;

public class throw1 {
	
	public static void main(String []args)
	{
	try
	{
		
		throw new ArithmeticException("KFMDFDIFJEF");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("lkgog");
	}
	try
	{
		throw new ArrayIndexOutOfBoundsException("fmfeoirf");
	}
	catch(NullPointerException e)
	{
		System.out.println("slflkf");
	}
	
	finally
	{
		System.out.println("hai sarath ");
	}
	}

}
