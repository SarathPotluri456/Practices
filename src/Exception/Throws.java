package Exception;

public class Throws {
   
	 void m1() throws InterruptedException
	 {
		 Thread t1=new Thread();
		 t1.sleep(100);
	 }
	
	public static void main(String[] args)
	{
		Throws t1=new Throws();
		try
		{
			t1.m1();
		}catch(Exception e)
		{
			System.out.println("fsflpf");
		}

	}

}
