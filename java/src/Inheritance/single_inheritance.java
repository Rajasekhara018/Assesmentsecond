package Inheritance;

import java.util.Scanner;

public class single_inheritance 
{
	Scanner sc = new Scanner(System.in);
	String empname=sc.next();
	String empid=sc.next();
	String address=sc.next();
	String workinglocation=sc.next();
	long phonenumber=sc.nextLong();
}
	class employ1 extends single_inheritance 
	{
		void display()
		{
		System.out.print(empname+" "+empid+" "+address+" "+workinglocation+" "+phonenumber+" ");
		}
	public static void main(String[] args) 
	{
		employ1 ed =new employ1();
		ed.display();
	}

}
