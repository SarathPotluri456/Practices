package CustomizedExp;
import java.util.*;
public class ClientRun {
	 void check() 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please Give Value of a:");
	   int a=sc.nextInt();
	   System.out.println("Please Give Value of b:");
	   int b=sc.nextInt();
	   int c=a-b;
		if(c<0)
		{
			throw new CustomRun("Please Enter Proper Values");
		}
		else
		{
			System.out.println("The Sub value is :"+c);
		}
		
	}

}
