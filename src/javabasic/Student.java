package javabasic;

public class Student {
	
	String name="pandurang";
	char div='A';
	int rollNo=13;
	
	
	public void study(){
		
		System.out.println(name +"  is studying");
		System.out.println(div);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		
		Student var =new Student ();
		var.study();
		
		
		// TODO Auto-generated method stub

	}

}
