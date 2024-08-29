package javabasic;

public class Staticvar {
	
	static int a=19;
	
	public static void m1 () {
		int a =23;
		System.out.println(a);
		System.out.println(Staticvar.a);
	}
	

	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}

}
