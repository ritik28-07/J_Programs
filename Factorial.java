import java.util.*;

public class Factorial
{ 	
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact=1;
		while(n!=0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}
}	