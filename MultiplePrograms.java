import java.util.*;
public class MultiplePrograms
{
	public static void main(String arg[])
	{	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		Fun f = new Fun();

		f.getEvenOdd(n);
		f.getPrime(n);
		f.getFactorial(n);
		f.getSwap(n,m);
	}
}
class Fun
{
	void getEvenOdd(int n)
	{	
		if(n%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

	void getPrime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
		{
			System.out.println( (n) + " is a prime number");
		}
		else
		{
			System.out.println( (n) + " is not prime");
		}
 	}

	void getFactorial(int n)
	{
		int fact=1;
		while(n!=0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}

	void getSwap(int n, int m)
	{
		int c;
		c = n;
		n = m;
		m = c;
		System.out.println((n) +" "+ (m));
	} 
}
		