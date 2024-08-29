package assignment;

public class Student {
	
	public Student(String name,int phy,int chem,int maths) {
		System.out.println("student name:-"+name);
		System.out.println("physics marks:-"+phy);
		System.out.println("chemistry marks:-"+chem);
		System.out.println("math marks:-"+maths);
		int total=phy+chem+maths;
		System.out.println("total marks:-"+total);
		
		
		
		System.out.println(".........................");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student("Avdhut",20,30,40);
		new Student("Raju",30,40,50);
		new Student("Seema",40,50,60);

	}

}
