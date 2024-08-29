package assignment;

public class Student1 {

	
	public Student1(String name,int maths,int phy,int chem) {
				
		System.out.println("student name:-"+name);
		System.out.println("math marks:-"+maths);
		System.out.println("physics marks:-"+phy);
		System.out.println("chemistry marks:-"+chem);
		int total=maths+phy+chem;
		System.out.println(total);
		if(maths>=35&&phy>=35&&chem>=35&&total>=105)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}	
		System.out.println("..........................");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Student1("Avdhut",30,40,50);
		new Student1("Raju",35,45,55);
		new Student1("Seema",55,35,50);
		
		
		
		
		
		
		

	}

}
