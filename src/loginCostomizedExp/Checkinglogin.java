package loginCostomizedExp;

public class Checkinglogin {
	
	void login(int age) throws BaseExp
	{
		if(age<=13)
		{
			throw new BaseExp("Registration not allowed in facebook");
		}
		else
		{
			System.out.println("Registration allowed in face book");
		}
	}

}
