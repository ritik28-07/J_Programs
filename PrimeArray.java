import java.util.*;
public class PrimeArray
{
	public static void main(String[] args)
	{
		PrimeArray p = new PrimeArray();
		p.prime();		
	}
	void prime()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter length");
		int n = s.nextInt();
		int [] x = new int [100];
		int k;
		int i,j,y=0;
		for(k=0;k<n;k++)
		{
			x[k] = s.nextInt();
		}
		
		for(j=0;j<n;j++)
		{
			for(i=2;i<j;i++)
			{
				if(j%i==0)
				{
					break;
				}
			}
			if(i==j)
			{
				for(y=2;y<n;y++)
				{
					if(x[j]%y==0)
					{
						break;
					}
				}
				if(y!=x[j])
				{	
					System.out.println( j + "-" + x[j]);
				}
			}
		}
	}
}
