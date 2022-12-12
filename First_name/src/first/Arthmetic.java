package first;

public class Arthmetic {

	public int sum (int a , int b)
	{
		int c;
		c= a+b;
		System.out.println("Sum of" + c);
		return c;
		
	}
	
	public int sub (int a , int b)
	{
		int c;
		c= a-b;
		System.out.println("sub of" + c);
		return c;
		
	}
	public void multi (int a , int b)
	{
		int c;
		c= a*b;
		System.out.println("Multi of" + c);
		
		
	}
	
	public static void main (String agr[])
	{
		Arthmetic manish = new Arthmetic();
		int sumresult=manish.sum(12,2);
		int subresult=manish.sub(10,2);
		manish.multi(sumresult, subresult);
		
				
	}
}
