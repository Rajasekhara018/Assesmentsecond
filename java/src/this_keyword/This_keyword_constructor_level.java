package this_keyword;

import java.util.Scanner;

public class This_keyword_constructor_level 
{
	static Scanner sc = new Scanner(System.in);
	This_keyword_constructor_level ()
	{
		System.out.print("raja");
	}
	This_keyword_constructor_level (int x)
	{
		this();
		System.out.print(x);
	}
	This_keyword_constructor_level (int y, String z)
	{
		this(sc.nextInt());
		System.out.print(y+" "+z);
	}
	This_keyword_constructor_level (int a, float b, double c)
	{
		this(sc.nextInt(),sc.next());
		System.out.print(a+" "+b+" "+c);
	}
	public static void main(String[] args) 
	{
		This_keyword_constructor_level kcl = new This_keyword_constructor_level(sc.nextInt(), sc.nextFloat(), sc.nextDouble());
	}

}
