package javabasic;

public class Nonstaticintononstatic {
	
	int a=10;
	int b=12;
	
	
	public void plus() {
		minus();
		int c=a+b;
		System.out.println(c);
	}
	
	public void minus() {
		nonstatic();
		int c=a-b;
		System.out.println(c);
	}
	
	public void nonstatic() {
		System.out.println("this is non static method");
	}

	public static void main(String[] args) {
		Nonstaticintononstatic ref1=new Nonstaticintononstatic();
		ref1.plus();
		
		// TODO Auto-generated method stub

	}

}
