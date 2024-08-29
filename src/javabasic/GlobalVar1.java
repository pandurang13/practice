package javabasic;

public class GlobalVar1 {
	
	static int a =19;
	static int b =20;
	
	public void m1() {
		int c =a+b;    //  static variable called into non static method
		System.out.println(c);
	}

	public static void main(String[] args) {
		GlobalVar1 boj=new GlobalVar1();
		boj.m1();
		// TODO Auto-generated method stub

	}

}
