package encapsualtion;

import java.util.Scanner;

class A {
	Scanner sc = new Scanner(System.in);
	String username = sc.next();
	String password = sc.next();

	void setusername(String username) {
		this.username = username;
		System.out.print(this.username);
	}

	String getusername() {
		System.out.print("enter username:");
		return this.username;
	}

	void setpassword(String password) {
		System.out.print(password);
	}

	String getpassword() {
		return this.password = password;
	}
}

class Customer {
	public static void main(String[] args) {
		A a1 = new A();
		a1.setusername("Krishna");
		System.out.println(a1.getusername());
		a1.getpassword();
	}
}
