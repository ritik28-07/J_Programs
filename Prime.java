import java.util.*;

public class Prime
{
	public static void main(String arg[])
	{	
		Scanner s1 = new Scanner(System.in);
		int x = s1.nextInt();
		int i;
		for(i=2;i<x;i++)
		{
			if(x%i==0)
			{
				break;
			}
		}
		if(x==i)
		{
			System.out.println( (x) + "is a prime number");
		}
		else
		{
			System.out.println( (x) + "is not prime");
		}
	}
}