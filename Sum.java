public class Sum
{
	public static void main(String[] args)
	{
		int x=10;
		System.out.println(x++ + "," + ++x);
		x=10;
		System.out.println((x++) + "," + (++x));
	}
}