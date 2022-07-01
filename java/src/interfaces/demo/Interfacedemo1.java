package interfaces.demo;

public class Interfacedemo1 implements Interfacedemo
{
	static void meth3()
	{
		System.out.print("ABC");
	}
	@Override
	public void meth1(int id) 
	{
		System.out.print(id);
		
	}

	@Override
	public void meth2(String name) 
	{
		System.out.print(name);
		
	}
	public static void main(String[] args)
	{
		Interfacedemo1 obj = new Interfacedemo1();
		meth3();
		obj.meth1(1234);
		obj.meth2("Raja Reddy");
	}

}
