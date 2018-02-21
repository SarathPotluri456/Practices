package Exception;

public class Throws {
   
	 void m1() throws InterruptedException 
	 {
		 Thread t1=new Thread();
		 t1.sleep(1000);
	 }
	
	public static void main(String[] args) throws InterruptedException
	{
		Throws t1=new Throws();
		System.out.println("fsflpf1");
		
			t1.m1();
		
			System.out.println("fsflpf2");
		

	}

}
