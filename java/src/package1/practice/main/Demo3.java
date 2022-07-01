package package1.practice.main;

public class Demo3 
{
	static int i=10;
	static int j=20;
	static 
	{
		methodone();
		System.out.print("1st static block");
	}
	public static void main(String[] args) 
	{
		methodone();
		System.out.print("Main method");
	}
	public static void methodone() 
	{
		System.out.print(j);
		System.out.print(i);
	}
	static 
	{
		System.out.print("2nd block");
	}
	
}
