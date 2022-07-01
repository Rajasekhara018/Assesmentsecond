package assesment.second;

public class HasARelationDemo2 
{
	HasARelationDemo1 d1= new HasARelationDemo1(); 
	void display()
	{
		System.out.print("car price is:"+d1.meth2());
	}
	public static void main(String[] args) 
	{
		HasARelationDemo2 obj = new HasARelationDemo2();
		obj.display();
	}

}
