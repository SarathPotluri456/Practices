package CustomizedExp;

public class Client {

	public static void main(String[] args) {
		try
		{
			throw new Custom1("This is existing error");
		}
		catch(Custom1 cus)
		{
			System.out.println(cus.getMessage());
		}

	}

}
