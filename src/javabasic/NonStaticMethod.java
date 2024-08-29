package javabasic;

public class NonStaticMethod {
	
	public void m1() {
		String name="pandurang";
		char Div='A';
		int Rollno=13;
		
		System.out.println(name);
		System.out.println(Div);
		System.out.println(Rollno);
	}
	
	public void m2() {
		System.out.println("Non static method require object creation");
	}

	public static void main(String[] args) {
		
		NonStaticMethod v=new NonStaticMethod();
		v.m1();
		v.m2();
		// TODO Auto-generated method stub

	}

}
