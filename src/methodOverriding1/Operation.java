package methodOverriding1;

public class Operation extends A {
	
	void show() throws ArithmeticException//Exception is not possible in this throws because
	 // Exception is the parent of ArithmeticException that's y we can't take in child class
	{
		System.out.println("this show method in Operation class");
	}

}
