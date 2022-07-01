package assesment.second;

public class MethodOverridingDemo1 extends MethodOverridingDemo
{
	 int meth1(String y)
	{
		System.out.print(super.meth1(sc.next()));
		System.out.print(y);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		MethodOverridingDemo1 ed = new MethodOverridingDemo1 ();
		System.out.print(ed.meth1(sc.next()));
	}

}
