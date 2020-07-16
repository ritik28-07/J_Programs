import java.util.*;
class Parent
{
	int x,y;
	void get()
	{
		Scanner s= new Scanner(System.in);
		x= s.nextInt();
		y= s.nextInt();
	}
	void display()
	{
		System.out.println(x + " " + y);
	}
}
class Child extends Parent
{
	int x,k;
	void display()
	{
		super.display();
		System.out.println(k);
	}
	void get(int k)
	{
		super.get();
		this.k = k;
	}
	void get()
	{
		Scanner s = new Scanner(System.in);
		k= s.nextInt();
		this.get(k);
	}
}
class Main1
{
	public static void main(String[] args)
	{	
		Child c = new Child();
		Parent p1 = new Parent();
		Parent p2 = c;
		c.get();
		c.display();
		p1.get();
		p1.display();
		p2.get();
		p2.display();
		System.out.println(p2.y);
		System.out.println(p2.x);
	}
}