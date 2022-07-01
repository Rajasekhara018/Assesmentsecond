package assesment.second;

import java.util.Scanner;

public class MethodOverloading 
{
	static Scanner sc = new Scanner(System.in);
	static void m1(int x)
	{
		System.out.print(x);
	}
	static int m1(String y)
	{
		System.out.print(y);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		MethodOverloading fe = new MethodOverloading();
		fe.m1(sc.nextInt());
		System.out.print(fe.m1(sc.next()));
	}

}
