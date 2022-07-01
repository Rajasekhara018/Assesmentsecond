package Static_control_flow;

import java.util.Scanner;

public class a 
{
	static Scanner sc = new Scanner(System.in);
	static int m1(String a)
	{
		System.out.print(a);
		return sc.nextInt();
	}
	{
		System.out.print("instance Block");
	}
	a()
	{
		System.out.print("default constructor");
	}
	static 
	{
		System.out.print("Static block");
	}
	a(int b)
	{
		System.out.print("parameterised constructor"+b);
	}
	void m2(String c)
	{
		System.out.print(c);
	}
	public static void main(String[] args) 
	{
		a a1 = new a();
		a a2 = new a(sc.nextInt());
		a1.m2(sc.next());
		System.out.print(a1.m1(sc.next()));
	}
}
