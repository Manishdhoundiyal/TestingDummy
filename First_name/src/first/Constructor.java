package first;

public class Constructor {
	
	public Constructor()
	{
		this(40,20,90);
		System.out.println("Default constructor");
		
	}
	
	public Constructor(int a)
	{this ();
		System.out.println("one parameterized constructor");
		
	}

	public Constructor(int a, int b)
	{this(50);
		System.out.println("two parameterized constructor");
		
	}
	
	public Constructor(int a, int b,int c)
	{
		System.out.println("Three parameterized constructor");
		
	}
	
	public Constructor(int a, int b,int c ,int d)
	{this(80,90);
		System.out.println("four parameterized constructor");
		
	}
	
	public static void main(String[] args) 
	{
		Constructor ref = new Constructor(40,20,90,30);	
	}
}
