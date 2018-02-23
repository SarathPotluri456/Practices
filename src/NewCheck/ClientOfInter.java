package NewCheck;

public class ClientOfInter implements New2{
    public void m1()
    {
    	System.out.println("in container calss m1 method");
    }
	public static void main(String[] args) {
		New2 ci=new ClientOfInter();
		ci.m1();
 
	}

}
