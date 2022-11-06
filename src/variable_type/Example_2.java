package variable_type;

public class Example_2 {
	int a=20;
	String name="deepak";
	static int b=30;
	

	public static void main(String[] args) {
		
	 Example_2 ob=new Example_2();
	 
		int sum=10+ob.a;// we can operate on global variable in main method ,for that while using operation we have to check whether it is static variable 
		                 //  or not if static variable then directly calling, otherwise we have create object than use in OPERATION using thst object
		int sub=20-b;
	
		System.out.println("name is "+ob.name);
		System.out.println("value of a is "+ob.a);
		System.out.println("addition is "+sum);
		System.out.println("subtraction is "+sub);
		 

	}

}
