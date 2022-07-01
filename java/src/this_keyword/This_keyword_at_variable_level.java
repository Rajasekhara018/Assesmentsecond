package this_keyword;

import java.util.Scanner;

public class This_keyword_at_variable_level 
{
	static Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	void m1(int x)
	{
		System.out.print(this.x);//if you want call the instance variable use this keyword, it will makes the preference to the local variable 
	}
	public static void main(String[] args)
	{
		This_keyword_at_variable_level dc = new This_keyword_at_variable_level ();
		dc.m1(sc.nextInt());

	}

}
