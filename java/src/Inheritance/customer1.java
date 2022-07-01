package Inheritance;

public class customer1 extends retail_market
{
	void display()
	{
		System.out.print("brand name:"+brand+" "+"processor:"+processor+" "+"model:"+model+" "+"battery"+battery+" "+"cam:"+cam+" "+"price:"+rprice+" ");
	}

	public static void main(String[] args) 
	{
		customer1 cd = new customer1();
		cd.display();

	}

}
