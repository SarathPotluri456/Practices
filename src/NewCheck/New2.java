package NewCheck;

public interface New2 extends New1 {
default void m1()
{
	System.out.println("In new2 m1 method called:");
}
}
