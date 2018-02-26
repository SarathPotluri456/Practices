package This;

public class this1 {
	this1(String s)
	{
		System.out.println(s);
	}
	this1()
	{
		this("Sharath Potluri");
		System.out.println("This constructor with out arguments");
	}
	

	public static void main(String[] args) {
		this1 t1=new this1();
		

	}

}
