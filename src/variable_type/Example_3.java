package variable_type;

public class Example_3 {
	
	int a=10;
	static int b=20;
	

	public static void main(String[] args) {
		Example_3 ob=new Example_3();
		ob.test();
		test2();
		
	 

	}
	public void test() {
		
		int c=30;
		int sum=a+c;
		int sub=c-20;
		System.out.println("sum is "+sum);
		System.out.println("subtraction is"+sub);
		
	}
	public static void test2() {
		
		Example_3 ob=new Example_3();//creating object 
		int d=40;
		int sum1=d+ob.a;//calling non static global variable in static method by creating object in STATIC METHOD UNUSUAL LIKE WE CREATE OBJECT
		//NERALLLY IN MAIN METHOS//
		System.out.println("addition is "+sum1);
	}

}
