package Nov.ex_18112024_Exception_Part2;
public class Exception_handling_notepad
{
	public static void main(String[] args)
	{
		String a=null;
		try
		{
			a=args[0];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		int b=0;
		try
		{
			b=Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		int c=0;
		try
		{
			c=b/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		String s1 = "Nehal";
		try
		{
			s1=null;
			System.out.println(s1.trim());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}

		finally
		{
			System.out.println("End of Program");
		}
		
	}
}