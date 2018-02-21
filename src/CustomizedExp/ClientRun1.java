package CustomizedExp;

public class ClientRun1 {
 public static void main(String []args)
 {
	 ClientRun cr=new ClientRun();
	 try
	 {
	 cr.check();
	 }
	 catch(CustomRun cr1)
	 {
		 System.out.println(cr1.getMessage());
	 }
 }
}
