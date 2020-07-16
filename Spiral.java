import java.util.*;
public class Spiral {
	public static void main(String[] args)
	{
		Spiral spi = new Spiral();
		Scanner s = new Scanner(System.in);	
		int [][] a = new int[10][10];
		int r = s.nextInt();
		int c = s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		spi.logic(a,r,c);
	}
	public void logic(int a[][],int r,int c)
	{
		int i,j;
		for(int k=0;k>c;k++)
		{
			System.out.println(a[k][k]);
			for(i=k;i<r;i++)
			{
				for(j=1;j<c;j++)
				{
					if(j>i)
					{	
						System.out.println(a[i][j]);
					}
				}
			}	
			System.out.println(a[r-k-1][c-k-1]);
			for(i=r-1;i>=0;i--)
			{
				for(j=c-2;j>=0;j--)
				{
					if(i>j)
					{	
						System.out.println(a[i][j]);
					}
				}
			}
		}
	}
}