package StringBasic;
import java.util.*;
public class PalendromeString {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String to Check Either Plaemdrom r not:");
        String str=sc.next();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
        	str1=str1+str.charAt(i);
        }
        if(str1.equals(str))
        {
        	System.out.println("Given String is Palendram");
        }
        else
        	System.out.println("Not Palendram");

        
	}

}
