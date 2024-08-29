package javabasic;

public class Varchobject {
	int a=10;
	
	

	public static void main(String[] args) {
		
		Varchobject vv=new Varchobject();
		
		System.out.println(vv.a);
		// TODO Auto-generated method stub
		// value of variable changes object to object
		Varchobject vb=new Varchobject();
		vb.a=20;
		System.out.println(vb.a);
		

	}

}
