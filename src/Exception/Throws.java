package Exception;

public class Throws {
   
	 void m1() throws InterruptedException 
	 {
		 
		 Thread.sleep(1000);
		 throw new InterruptedException("figjdfiugj");
	 }
	
	public static void main(String[] args) 
	{
		Throws t1=new Throws();
		System.out.println("fsflpf1");
		
			try {
				t1.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
	
				
				
				
				System.out.println(e.getMessage());
			}
		
			System.out.println("fsflpf2");
		

	}

}
