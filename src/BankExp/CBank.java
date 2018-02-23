package BankExp;

public class CBank extends Exception {
  
	public CBank(double f)
	{
		System.err.println("You have the insufficient money of:Rs."+f);
	}
}
