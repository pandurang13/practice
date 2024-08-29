package javabasic;

public class GlobalVar2 {
	
	int a=10;
	int b=10;
	
	public static void m1() {
		GlobalVar2 v2=new GlobalVar2();
		int c =v2.a+v2.b;// calling non static global variable into static method by creating object
		System.out.println(c);
	}

	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}

}
