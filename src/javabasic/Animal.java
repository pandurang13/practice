package javabasic;

public class Animal {
	String bark="barking";
	String run="running";
	
	public void barking() {
		System.out.println(bark);
	}
	
	public void running() {
		System.out.println(run);
	}

	public static void main(String[] args) {
		
		Animal ref=new Animal();
		ref.barking();
		System.out.println("shimbha");
		ref.running();
		// TODO Auto-generated method stub

	}

}
