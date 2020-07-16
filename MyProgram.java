import java.util.*;

public class MyProgram
{
	public static void main(String arg[])
	{
		Car c1 = new Car();
		Car c2 = new Car();
		c1.getData();
		c2.getData();
		c1.display();
		c2.display();
	}
}
class Car
{
	String color = "";
	int model;

	void getData()
	{
		Scanner s = new Scanner(System.in);
		color = s.nextLine();
		model = s.nextInt();	
	}	
	
	void display()
	{
		System.out.println(color+" "+model);
		//System.out.println(model);	
	}
}