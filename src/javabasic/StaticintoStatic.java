package javabasic;

public class StaticintoStatic {
	
	String sub="physics";
	
	public static void subject() {
		class1();
		String  sub="math";
		System.out.println("chemistry");
		System.out.println(sub);
		
	}
	
	public void subject1() {
		System.out.println(sub);
		
		
	}
	
	public static void class1() {
		System.out.println('A');
		System.out.println("pandurang");
		
		
	}

	public static void main(String[] args) {
		StaticintoStatic var1=new StaticintoStatic();
		var1.subject1();
		subject();
		
		
		// TODO Auto-generated method stub

	}

}
