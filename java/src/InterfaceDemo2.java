import assesment.second.InterfaceDemo;
import assesment.second.InterfaceDemo1;

public class InterfaceDemo2 implements InterfaceDemo1 
{

	@Override
	public void meth1(int id) 
	{
		System.out.print(id);
	}
	@Override
	public void meth4(int salary) 
	{
		System.out.print(salary);
		
	}
	public static void main(String[] args)
	{
		InterfaceDemo2 fe =new InterfaceDemo2();
		fe.meth4(sc.nextInt());
		fe.meth1(sc.nextInt());
		InterfaceDemo1.meth3(sc.next());
		System.out.print(InterfaceDemo.meth2(sc.next()));
	}
}
