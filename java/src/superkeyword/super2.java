package superkeyword;

public class super2 extends super1
{
	int x=10;
	void display()
	{

		System.out.print(super.x);
		System.out.print(x);
	
	}

	public static void main(String[] args)
	{
		super2 obj = new super2();
		obj.display();
	}

}
