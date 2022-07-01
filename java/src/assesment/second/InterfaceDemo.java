package assesment.second;

import java.util.Scanner;

public interface InterfaceDemo 
{
	Scanner sc = new Scanner(System.in);
	abstract void meth1(int id);
	public static float meth2(String name)
	{
		System.out.print(name);
		return sc.nextFloat();
	}
}
