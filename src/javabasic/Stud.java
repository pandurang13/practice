package javabasic;

public class Stud {
	
	public void studentinfo(String studentname,int maths,int chem,int phy) {
		System.out.println("student name :"+studentname);
		System.out.println("maths :"+maths);
		System.out.println("chemistry :"+chem);
		System.out.println("physics :"+phy);
		int total=maths+chem+phy;
		System.out.println("total marks :"+total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud v1=new Stud();
		v1.studentinfo("Avdhut",55, 65, 75);
		
		System.out.println(".................");
		v1.studentinfo("Raju", 30, 40, 50);
		
		System.out.println(".................");
		v1.studentinfo("seema", 10, 20, 30);
		

	}

}
