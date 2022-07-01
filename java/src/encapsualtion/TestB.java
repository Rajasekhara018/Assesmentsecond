package encapsualtion;

import java.util.Scanner;

class B {
	Scanner sc = new Scanner(System.in);
//	System.out.print("enter username:");
	String username = sc.next();
//	System.out.print("enter password:");
	String password = sc.next();

	void setusername(String username) {
		System.out.print(username);
	}

	String getusername() {
		return this.username = username;
	}

	void setpassword(String password) {
		System.out.print(password);
	}

	String getpassword() {
		return this.password = password;
	}
}

class TestB {
	public static void main(String[] args) {
		B b1 = new B();
		b1.getusername();
		b1.getpassword();
	}

}
