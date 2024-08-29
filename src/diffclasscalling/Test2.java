package diffclasscalling;

public class Test2 {
	
	public static void m3() {
		System.out.println("test2 static method m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 v1=new Test1();
		v1.m2();
		Test1.m1();
		
		Test2 v2=new Test2();
		m3();

	}

}
