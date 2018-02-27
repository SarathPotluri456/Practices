package linear_BinarySearch;

public class BinarySearch {
      
	void binerySearch(int arr[],int key)
	{
		
		int lowindex=0;
		int highindex=arr.length-1;
		while(lowindex<=highindex)
		{
			int flag=0;
			int mid=(lowindex+highindex)/2;
			if(arr[mid]<key)
			{
				lowindex=mid+1;
			}
			else if(arr[mid]>key)
			{
				highindex=mid-1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("key value is founded");
				break;
			}
			else
			{
				
				System.out.println("Founded Index not found value is"+mid);
				break;
			}
			
			
		}
		
		

	}
       	
	
	public static void main(String[] args)
	{
		BinarySearch bs=new BinarySearch();
		int arr[]= {10,20,30,40,50,60};
	
		 int key=100;
		bs.binerySearch(arr,key);

	}

}
