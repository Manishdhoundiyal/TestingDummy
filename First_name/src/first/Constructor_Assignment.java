package first;

public class Constructor_Assignment {
	
	public void Default()
	{
		this.three(12,23,76);
		System.out.println("Default constructor");
		this.one(2);
		this.two(98, 12);
		this.four(1, 2, 3, 4);
		
	}
	public void one(int a)
	{
		System.out.println("One parameterized method");
	}
	public void two (int a , int d)
	{
		System.out.println("Two parameterized method");
		
	}
	
	public void three (int a , int b,int c)
	{
		System.out.println("Three parameterized method");
	}
	
	public void four (int a , int b , int c , int d)
	{
		System.out.println("Four parameterized method");
	}
	
	
	
	public static void main (String agrs[])
	{
		Constructor_Assignment obj = new Constructor_Assignment();
		obj.Default();
	}
}
