package NewExp;
import java.util.*;
public class Client {

	public static void main(String[] args){
		Operation op=new Operation();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please Enter A Value:");
	    int a=sc.nextInt();
	    System.out.println("Please Enter B value:");
	    int b=sc.nextInt();
	    String s=null;
	    
	    try
	    {
//	    op.sub(a, b);
	    	System.out.println(s.length());
	    }
	    catch(ArithmeticException | NullPointerException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}

}
