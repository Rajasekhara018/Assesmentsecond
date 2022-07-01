package Inheritance;

public class customer2 extends retail_market
{
	void display()
	{
		System.out.print("brand name:"+brand+" "+"model:"+model+" "+"price:"+rprice+" ");
	}

	public static void main(String[] args) 
	{
		customer2 cd1 = new customer2();
		cd1.display();

	}

}