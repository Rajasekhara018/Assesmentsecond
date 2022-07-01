package Inheritance;

public class class_b extends class_A {
	class_A a1 = new class_A();

	int m4(String d) {
		System.out.print(d);
		System.out.print(a1.m2(class_A.sc.next()));
		return class_A.sc.nextInt();
	}

	public static void main(String[] args) {
		class_b b1 = new class_b();
		System.out.print(b1.m4(class_A.sc.next()));

	}

}
