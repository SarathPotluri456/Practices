package StringBasic;
import java.util.*;
public class DuplicateLetter {
	void checkDupli(String str)
	{
		char []inp=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++)
		{ 
		
			for(int j=i+1;j<=str.length()-1;j++)
			{
				if(inp[i]==inp[j])
				{
				System.out.println(inp[j]);
				break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		DuplicateLetter dl=new DuplicateLetter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String to checking:");
        String a=sc.next();
        dl.checkDupli(a);
	}

}
