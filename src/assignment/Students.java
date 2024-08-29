package assignment;


public class Students {
	int phy;
	int chem;
	int math;
	int total;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students v1=new Students();
		v1.phy=60;
		v1.chem=80;
		v1.math=90;
		v1.total=v1.phy+v1.chem+v1.math;
		
		System.out.println("avdhut marks:-");
		System.out.println("physics :"+v1.phy);
		System.out.println("chemistry :"+v1.chem);
		System.out.println("math :"+v1.math);
		System.out.println("total marks :"+v1.total);
		System.out.println("..................................");
		
		
		Students v2=new Students();
		v2.phy=40;
		v2.chem=60;
		v2.math=80;
		v2.total=v2.phy+v2.chem+v2.math;
		
		System.out.println("Raju marks :");
		System.out.println("physics :"+v2.phy);
		System.out.println("chemistry :"+v2.chem);
		System.out.println("math :"+v2.math);
		System.out.println("total marks :"+v2.total);
		System.out.println("..................................");
		
		Students v3=new Students();
		v3.phy=77;
		v3.chem=60;
		v3.math=99;
		v3.total=v3.phy+v3.chem+v3.math;
		
		System.out.println("seema marks :");
		System.out.println("physics :"+v3.phy);
		System.out.println("chemistry :"+v3.chem);
		System.out.println("math :"+v3.math);
		System.out.println("total marks :"+v3.total);
		
		
		

	}

}
