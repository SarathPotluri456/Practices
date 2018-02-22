package BankExp;

public class CheckingTransactions {
	
	public int deposit;
	public double balance;
	public int withdraw;
	public int deposit(int d)
	{
		return d;
	}
	public int withdraw(int w)
	{
		return w;
	}
	public double balance(int d,int w) throws CBank
	{
		double bal;
		double needs;
		bal=d-w;
		if(bal>0)
		{
			return bal;
		}
		else
		{
			needs=w-d;
			throw new CBank(needs);
		}
		
	}


}
