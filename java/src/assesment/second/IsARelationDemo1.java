package assesment.second;

import java.util.Scanner;

public class IsARelationDemo1 extends IsARelationDemo
{
	static Scanner sc = new Scanner(System.in);
	void meth2(String address)
	{
		System.out.print(address);
	}
	public static void main(String[] args) 
	{
		IsARelationDemo1 obj = new IsARelationDemo1();
		obj.meth2(sc.next());
		obj.meth1(sc.next());

	}

}
