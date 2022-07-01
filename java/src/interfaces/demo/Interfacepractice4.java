package interfaces.demo;

public class Interfacepractice4 extends  Interfacepractice2 implements Interfacepractice, Interfacepractice1 
{
	Interfacepractice4(int id) 
	{
		super(id);
		System.out.print(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void meth2(String name)
	{
	System.out.print(name);
		
	}

	@Override
	public void meth1(float salary)
	{
		System.out.print(salary);
		
	}
	public void meth3()
	{
		System.out.print("run");
	}
	public static void main(String[] args) 
	{
		Interfacepractice4 de2 = new Interfacepractice4(123);
		de2.meth1(15000);
		de2.meth2("ram");
		//meth5("Toucan");
		de2.meth3();
		//meth4();
	}

}
