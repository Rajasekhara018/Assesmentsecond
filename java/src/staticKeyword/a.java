package staticKeyword;

import java.util.Scanner;

public class a 
{
	static Scanner sc = new Scanner(System.in);
	String name=sc.next();
	String rollno=sc.next();
	static String college=sc.next();
	
	a(String name, String rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.print(name+" "+rollno+" "+college+" ");
	}
	public static void main(String[] args) 
	{
		a a1 = new a(sc.next(),sc.next());
		a a2 = new a(sc.next(),sc.next());
		a1.display();
		a2.display();
	}

}
