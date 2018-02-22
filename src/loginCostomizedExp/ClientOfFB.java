package loginCostomizedExp;
import java.util.*;
public class ClientOfFB {

	public static void main(String[] args) 
	{
		Checkinglogin cl=new Checkinglogin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Age:");
		int a=sc.nextInt();
		try
		{
			cl.login(a);	
		}
		catch(BaseExp e)
		{
			
		}
		 

	}

}
