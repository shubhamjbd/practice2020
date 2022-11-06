package variable_type;

public class Example_1 {
	 int a=10;
	 static int b=20;
	 String name="deepak";

	public static void main(String[] args) {
		test();
		Example_1 ob=new Example_1();
		ob.test2();


	}
	public static void test() {
		int c=30;
		//int sum=c+a; we can not call non static variable into static method//
		int sum=c+b;   //we can call only static variable into the static method//
		System.out.println("addition is "+sum);

	}
	
	public void test2() {
		int d=40;
		int sub=d-a;
		int sub2=d-b;    // we can call any kind of variable in non static method//
		System.out.println("subtraction is "+sub);
		System.out.println("subtraction is "+sub2);
	}

}
