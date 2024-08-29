package javabasic;

public class Localvar {
	
	int a=10;
	
	
	public void m1() {
		int a=20;
		System.out.println(a);
		System.out.println(this .a);
	}
	

	public static void main(String[] args) {
		Localvar vx=new Localvar();
		
		vx.m1();
		
		// TODO Auto-generated method stub

	}

}
