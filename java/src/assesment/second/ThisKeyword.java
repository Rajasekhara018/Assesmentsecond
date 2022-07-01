package assesment.second;

public class ThisKeyword 
{
	static void meth1()
	{
		System.out.println("1st method");
	}
	void meth2()
	{
		this.meth1();
		System.out.println("2nd method");
	}
     void meth3()
	{
		this.meth2();
		System.out.println("3rd method");
	}
	public static void main(String[] args) 
	{
		ThisKeyword dc = new ThisKeyword();
		dc.meth3();
	}
}
