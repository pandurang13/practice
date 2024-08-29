package javabasic;

public class GlobalVar {
	
	static int a=20;
	int b=30;
	public void m1() {
		int b=25;
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		GlobalVar v2=new GlobalVar();
		v2.m1();
		// TODO Auto-generated method stub

	}

}
