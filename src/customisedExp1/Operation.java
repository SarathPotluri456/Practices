package customisedExp1;

import java.util.Scanner;

import CustomizedExp.CustomRun;

public class Operation {

	 void check() throws A
	 {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Please Give Value of a:");
		   int a=sc.nextInt();
		   System.out.println("Please Give Value of b:");
		   int b=sc.nextInt();
		   int c=a-b;
			if(c<0)
			{
				throw new A("Please Enter Proper Values");
			}
			else
			{
				System.out.println("The Sub value is :"+c);
			}
		
			
	 }
}
