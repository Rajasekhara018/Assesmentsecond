package assesment.second;

import java.util.Scanner;

public class Facebook
{
	static Scanner sc = new Scanner(System.in);
	private String username=sc.next();
	private String password=sc.next();
	 void setusername(String username)
	{
		 System.out.println("old username:"+this.username);
		this.username=username;
	}
	String getusername()
	{
		return username;
	}
	 void setpassword(String password)
	{
		 System.out.println("old password"+this.password);
		this.password=password;
	}
	String getpassword()
	{
		return password;
	}
}
