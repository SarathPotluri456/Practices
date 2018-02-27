package linear_BinarySearch;
import java.util.*;
public class LinearSearch {
	 void search(int arr[],int key)
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==key)
			 {
				 System.out.println("The Key Value is found");
			 }
			 
		 }
	 }

	public static void main(String[] args) 
	{
		LinearSearch ls=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("Please Give Array Values:");
		for(int i=0;i<5;i++)
		{
			System.out.println("The Value of arr["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter which number you want to search:");
        int a=sc.nextInt();
        ls.search(arr, a);
        
 	}

}
