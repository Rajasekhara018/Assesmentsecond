package assesment.second;

public class Customer extends Facebook
{

	public static void main(String[] args) 
	{
		Customer cd = new Customer();
		System.out.print("Reset your username:");
		cd.setusername(sc.next());
		 System.out.print("Reset your password:");
		cd.setpassword(sc.next());
		System.out.println("New username:"+cd.getusername());
		System.out.println("New password:"+cd.getpassword());
	}

}
