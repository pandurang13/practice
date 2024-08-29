package javabasic;

public class Examplereturntype {
	
	public void m1() {
		System.out.println("no return type no argument");
	}
	
	public boolean m1(char c) {
		System.out.println("with return type with argument ");
		return false;
		
	}
	
	public void m1(int a,boolean b,char d) {
		System.out.println("without return type with argument");
		
	}
	
	public char m2() {
		System.out.println("with return type without argument ");
		
	    return 'a';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Examplereturntype var= new Examplereturntype();
		var.m1();
		boolean g=var.m1('s');
		System.out.println(g);
		var.m1(8, true, 'f');
		System.out.println(var.m2());

	}

}
