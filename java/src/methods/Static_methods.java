package methods;

import java.util.Scanner;
public class Static_methods 
{
	 static Scanner sc =new Scanner(System.in);
	static void m1() //static Non-return type without parameters
	{
		System.out.print("training");
	}
	static String m2(int a)  //Static with return type  with parameter
	{
		System.out.print("Enter String value:");
		String sv= sc.next();
		return sv;
	}
	static String m3()  //static with return type without parameter
	{
		System.out.print("Enter String value:");
		String sv= sc.next();
		return sv;
	}
	static void m4(int b) //static non-return type with parameters
	{
	
		System.out.print(b);
	}
	void m5()   //void without return type without parameter
	{
		System.out.print("Raja");
	}
	void m6(int x)   //void without return type with parameter
	{
		System.out.print(x);
	}
	String m7(int y)   //void without return type with parameter
	{
		System.out.print(y);
		System.out.print("Enter string values:");
		String sv =sc.next();
		return sv;
	}
	String m8()   //void without return type without parameter
	{
		System.out.print("Enter string values:");
		String sv =sc.next();
		return sv;
	}
	
	
	public static void main(String[] args) 
	{
		Static_methods de = new Static_methods();
		de.m1();//By using object name
		m1(); //By using method name
		System.out.print("Enter int value:");
		System.out.print(de.m2(sc.nextInt()));//BY using object name
		System.out.print(m2(sc.nextInt())); //BY using method name
		System.out.print(de.m3());//BY using object name
		System.out.print(m3()); //BY using method name*/
		System.out.print("Enter int value:");
		de.m4(sc.nextInt()); //by using object name
		m4(sc.nextInt()); //By using method name
		de.m5(); //For N/*de.m1();//By using object name
		m1(); //By using method name on-static variables we can able to call by object only. 
		System.out.print("Enter int value:");
		de.m6(sc.nextInt());// in this case we can make the scanner statement as static 
		System.out.print("Enter int value:");
		System.out.print(de.m7(sc.nextInt())); // If void keyword is there in the method we can call by object only or otherwise we can use print statement and object as well. 
		System.out.print(de.m8());
	}
}
