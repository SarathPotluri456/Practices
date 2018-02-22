package BankExp;

public class CBank extends Exception {
  
	public CBank(double f)
	{
		System.out.println("You have the insufficient money of:"+f);
	}
}
