package this_keyword;

import java.util.Scanner;

public class This_keyword_at_variable_level2
{
	static Scanner sc = new Scanner(System.in);
	float m1(String a)
	{
		System.out.print(a);
		float fv = sc.nextFloat();
		return fv;
	}
	int m1(Boolean b)
	{
		System.out.print(b);
		System.out.print(this.m1(sc.next()));
		int iv =sc.nextInt();
		return iv;
	}
	String m1(double c)
	{
		System.out.print(c);
		System.out.print(this.m1(sc.nextBoolean()));
		String sv =sc.next();
		return sv;
	}
	void m1(char d)
	{
		System.out.print(d);
		System.out.print(this.m1(sc.nextDouble())); // if we can call the methods by object we can create the object by locally or otherwise we can use this keyword.
	}
	public static void main(String[] args) 
	{
		This_keyword_at_variable_level2 dc = new This_keyword_at_variable_level2();
		dc.m1(sc.next().charAt(0));
	}

}

