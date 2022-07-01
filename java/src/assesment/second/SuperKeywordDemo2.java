package assesment.second;

public class SuperKeywordDemo2 extends SuperKeywordDemo
{
	void meth2()
	{
		super.meth1();
		System.out.print("meth2");
	}
	public static void main(String[] args) 
	{
		 SuperKeywordDemo2 de = new  SuperKeywordDemo2();
		 de.meth2();

	}

}
