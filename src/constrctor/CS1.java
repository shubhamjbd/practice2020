package constrctor;

public class CS1 {
	
	public CS1() ///user defined zero parameter method//
	{
		System.out.println("running zero parameter constructor");
		
	}
	
	public static void main(String[] args) {
   
		CS1 ob=new CS1();	//creating object//
		ob.e2();
		
		 Variable_call O1=new  Variable_call();
		 
		 System.out.println("roll nuber is "+Variable_call.rollnumber);
			System.out.println("adhar number is "+O1.adharno);
			System.out.println("number is " +O1.no);
			System.out.println("NAME is "+O1.name);
			System.out.println(" bloodgroup is "+O1.bloodgroup);
			
	}
	public void e2() {
		long adharnumber=1234567890;
		System.out.println("Adhar number is "+adharnumber);
	}
}
