package customisedExp1;

public class Client {
 public static void main(String []args)
 {
	 Operation op1=new Operation();
	 
	 try {
		op1.check();
	} catch (A e) {
		// TODO Auto-generated catch block
	 System.out.println(e.getMessage());
	}
 }
}
