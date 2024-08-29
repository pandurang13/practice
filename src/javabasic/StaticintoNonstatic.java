package javabasic;

public class StaticintoNonstatic {
	
	public static void m1() {
		System.out.println("this is static method");
	}
	
	public void m2() {
		m1();
		
		System.out.println("this is non static method");
		
	}
	

	public static void main(String[] args) {
		StaticintoNonstatic vv=new StaticintoNonstatic();
		vv.m2();
		
		
		// TODO Auto-generated method stub

	}

}
