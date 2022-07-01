package Inheritance;

public class employ extends software_comapny
{
	void display()
	{
		System.out.print("name:"+name+"id:"+id+"working location"+workinglocation);
	}
	public static void main(String[] args) 
	{
		employ ed =new employ();
		ed.display();

	}

}
