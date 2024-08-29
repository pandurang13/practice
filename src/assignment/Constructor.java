package assignment;

public class Constructor {
	
	public Constructor(int a,boolean c) {
		System.out.println("cont1 is running");
		
	}
	
	public Constructor(boolean c, int a) {
		this(40,true);
		System.out.println("cont2 is running");
		
	}

	public Constructor() {
		this(true,30);
		System.out.println("cont3 is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Constructor();
		

	}

}
