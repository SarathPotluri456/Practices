package StringBasic;
import java.util.*;
public class StringToFindNull {
	void check()
	{
		Scanner sc=new Scanner(System.in);
		String []a=new String[10];
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Give the value of a["+i+"]");
				a[i]=sc.next();
			}
		}
		System.out.println("The Values of array:");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The Null value indexs are:");
		for(int i=0;i<10;i++)
		{
			if(a[i]==null)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		StringToFindNull st=new StringToFindNull();
		st.check();
		
	}

}
