import java.util.Scanner;

public class Error {
	public static void  main(String[] args)
	{
		int x,y;
		Scanner s = new Scanner(System.in);
		try {
			x = s.nextInt();
			y = s.nextInt();
			int z = x/y;
			//System.out.println("Result: " + z);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
}
