package package1.practice.main;

public class Demo4
{
	int i=10;
	{
		methodone();
		System.out.print("1st instance block");
	}
	Demo4()
	{
		System.out.print("parent class constructor");
	}

	public static void main(String[] args) 
	{
		Demo4 de = new Demo4();
		System.out.print("main method");
	}
	public void methodone()
	{
		System.out.print(j);
	}
	{
		System.out.print("2nd instance block");
	}
	int j=20;
}
