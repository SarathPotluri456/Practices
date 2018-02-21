package Exception;

public class Throw {
   
	void validate(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException();
	}
	else
		System.out.println("your age is support to vote");
	}
	
	public static void main(String[] args) {
		Throw t1=new Throw();
		try
		{
			t1.validate(20);
		}
		catch(Exception e)
		{
			System.out.println("your is not supported to vote");
		}
		finally
		{
		
			System.out.println("hai sarath");
		}

	}

}
