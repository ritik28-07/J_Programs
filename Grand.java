import java.util.*;
class Parent	
{
	int x=10;
	int y=100;
	void display()
	{
		System.out.println(x + " " + y);
	}
	void get()	
	{
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y= s.nextInt();
	}
}
class Child extends Parent
{
	int x=20;
	void display()
	{
		super.get();
		System.out.println(super.x + " " + super.y + " " + x + " " + y + " " + this.x + " " + this.y);
	}
	void get()	
	{
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y= s.nextInt();
	}
}
public class Grand
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.display();	
		Parent p = new Parent();
		System.out.println(p.x + " " + p.y);
	}
}