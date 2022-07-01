package assesment.second;

import java.util.Scanner;

public class AbstractionDemo1 extends AbstractionDemo
{
	static Scanner sc = new Scanner(System.in);
	void meth3()
	{
		System.out.print("meth3");
	}

	@Override
	int meth1() 
	{
		System.out.print("Meth1");
		return sc.nextInt();
	}

	@Override
	String meth2(String x) 
	{
		System.out.print(x);
		return sc.next();
	}
	public static void main(String[] args)
	{
		AbstractionDemo1 de = new AbstractionDemo1();
		System.out.print(de.meth2(sc.next()));
		System.out.print(de.meth1());
		de.meth3();
	}

}
