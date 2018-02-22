package Exception;

public class Throws {
   
	 void m1() throws InterruptedException 
	 {
		 
		 Thread.sleep(1000);
	 }
	
	public static void main(String[] args) 
	{
		Throws t1=new Throws();
		System.out.println("fsflpf1");
		
			try {
				t1.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("fsflpf2");
		

	}

}
