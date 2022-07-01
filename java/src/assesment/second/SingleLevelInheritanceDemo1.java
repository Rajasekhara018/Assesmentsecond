package assesment.second;

import java.util.Scanner;

public class SingleLevelInheritanceDemo1 extends SingleLevelInheritanceDemo
{
	static Scanner sc = new Scanner(System.in);
	void employee(String name)
	{
		this.softwarecompany("software company name:"+sc.next());
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		SingleLevelInheritanceDemo1 de2 = new SingleLevelInheritanceDemo1();
		de2.employee("employee name:"+sc.next());
	}
}
