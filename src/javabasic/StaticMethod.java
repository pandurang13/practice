package javabasic;

public class StaticMethod {
	
	public static void m1() {
		int a=12;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void m2() {
		System.out.println("static doec not required objet creation");
	}

	public static void main(String[] args) {
		m1();
		m2();
		// TODO Auto-generated method stub

	}

}
