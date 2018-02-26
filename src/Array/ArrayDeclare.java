package Array;
import java.util.*;
public class ArrayDeclare {
	int []a= {1,23,34,54,78};
	int []b=new int[6];
	int[] c=new int[10];

	public static void main(String []args)
	{
		ArrayDeclare ad=new ArrayDeclare();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter B Array Values:");
		for(int i=0;i<6;i++)
		{
			ad.b[i]=sc.nextInt();
			
		}
		System.out.println("The B Array Elememnts Are: ");
	for(int i=0;i<6;i++)
	{
		System.out.println(ad.b[i]);
	}
	System.out.println("The A Array Elememnts Are: ");
	for(int i=0;i<ad.a.length;i++)
	{
		System.out.println(ad.a[i]);
	}
	for(int x:ad.a)
	{
		System.out.println(x);
	}
	}
		
	

}
