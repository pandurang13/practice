package javabasic;

public class NonstaticintoStatic {
	
	public void m1() {
		System.out.println("this is non static method");
	}
	
	public static void m2() {
		NonstaticintoStatic v1=new NonstaticintoStatic();
		
		v1.m1();
		System.out.println("this is static method");
	}

	public static void main(String[] args) {
		m2();
		// TODO Auto-generated method stub

	}

}
